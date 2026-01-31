package org.example.cote.graph.unionfind

import java.util.TreeSet

//https://leetcode.com/problems/power-grid-maintenance

class PowerGridMaintenance {
    fun processQueries(c: Int, connections: Array<IntArray>, queries: Array<IntArray>): IntArray {
        // --------------------
        // 1) Union-Find
        // --------------------
        val parent = IntArray(c + 1) { it }
        val rank = IntArray(c + 1)

        fun find(x: Int): Int {
            if (parent[x] != x) parent[x] = find(parent[x])
            return parent[x]
        }

        fun union(a: Int, b: Int) {
            val ra = find(a)
            val rb = find(b)
            if (ra == rb) return
            if (rank[ra] < rank[rb]) parent[ra] = rb
            else if (rank[ra] > rank[rb]) parent[rb] = ra
            else {
                parent[rb] = ra
                rank[ra]++
            }
        }

        // --------------------
        // 2) Build components
        // --------------------
        for ((u, v) in connections) union(u, v)

        // --------------------
        // 3) component → TreeSet (online station id set)
        // --------------------
        val compMap = HashMap<Int, TreeSet<Int>>()

        for (i in 1..c) {
            val root = find(i)
            compMap.putIfAbsent(root, TreeSet())
            compMap[root]!!.add(i)   // initially all online
        }

        val isOnline = BooleanArray(c + 1) { true }

        // --------------------
        // 4) Process queries
        // --------------------
        val result = ArrayList<Int>()

        for (q in queries) {
            val type = q[0]
            val x = q[1]

            if (type == 1) {
                // query: maintenance check
                if (isOnline[x]) {
                    // x online → x가 처리
                    result.add(x)
                } else {
                    val root = find(x)
                    val set = compMap[root]!!
                    if (set.isEmpty()) {
                        result.add(-1)
                    } else {
                        result.add(set.first())   // online 중 가장 작은 id
                    }
                }
            } else {
                // type 2: x becomes offline
                if (isOnline[x]) {
                    isOnline[x] = false
                    val root = find(x)
                    compMap[root]!!.remove(x)
                }
            }
        }

        return result.toIntArray()
    }
}