package org.example.cote.graph.priorityQueue

import java.util.PriorityQueue
import kotlin.math.min

// https://leetcode.com/problems/minimum-cost-path-with-edge-reversals

class MinimumCostPathWithEdgeReversals {
    data class Edge(val to: Int, val cost: Int)
    data class State(val node: Int, val used: Int, val dist: Long)

    fun minCost(n: Int, edges: Array<IntArray>): Long {
        val outAdj = Array(n) { mutableListOf<Edge>() }
        val inAdj = Array(n) { mutableListOf<Edge>() }

        // build graph
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val w = e[2]
            outAdj[u].add(Edge(v, w))
            inAdj[v].add(Edge(u, w))   // for reverse operation
        }

        val INF = Long.MAX_VALUE / 4
        val dist = Array(n) { LongArray(2) { INF } }

        val pq = PriorityQueue<State>(compareBy { it.dist })
        dist[0][0] = 0
        pq.offer(State(0, 0, 0))

        while (pq.isNotEmpty()) {
            val cur = pq.poll()
            val u = cur.node
            val used = cur.used
            val d = cur.dist

            if (d > dist[u][used]) continue

            // 1. normal outgoing edges
            for (edge in outAdj[u]) {
                val v = edge.to
                val nd = d + edge.cost
                if (nd < dist[v][used]) {
                    dist[v][used] = nd
                    pq.offer(State(v, used, nd))
                }
            }

            // 2. reverse incoming edges (only if switch not used)
            if (used == 0) {
                for (edge in inAdj[u]) {
                    val v = edge.to
                    val nd = d + 2L * edge.cost
                    if (nd < dist[v][1]) {
                        dist[v][1] = nd
                        pq.offer(State(v, 1, nd))
                    }
                }
            }
        }

        val ans = min(dist[n - 1][0], dist[n - 1][1])
        return if (ans >= INF) -1 else ans
    }
}