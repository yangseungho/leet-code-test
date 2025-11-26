package org.example.cote.bfs

import java.util.LinkedList
import java.util.Queue

//https://leetcode.com/problems/bus-routes/description/

class BusRoutes {
    fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
        if (source == target) return 0

        // 정류장별로 어떤 버스가 지나가는지 매핑
        val stopToBuses = HashMap<Int, MutableList<Int>>()
        routes.forEachIndexed { busIndex, route ->
            route.forEach { stop ->
                stopToBuses.computeIfAbsent(stop) { mutableListOf() }.add(busIndex)
            }
        }

        val visitedStops = HashSet<Int>()
        val visitedBuses = HashSet<Int>()
        val queue: Queue<Pair<Int, Int>> = LinkedList() // (정류장 번호, 버스 탑승 횟수)
        queue.add(Pair(source, 0))
        visitedStops.add(source)

        while (queue.isNotEmpty()) {
            val (currentStop, busCount) = queue.poll()

            // 현재 정류장을 지나는 모든 버스 탐색
            for (bus in stopToBuses[currentStop] ?: emptyList()) {
                if (bus in visitedBuses) continue
                visitedBuses.add(bus)

                for (nextStop in routes[bus]) {
                    if (nextStop == target) return busCount + 1
                    if (nextStop !in visitedStops) {
                        visitedStops.add(nextStop)
                        queue.add(Pair(nextStop, busCount + 1))
                    }
                }
            }
        }

        return -1
    }
}