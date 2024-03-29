package com.nano.hacker.algo.graphtheory;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * You are given a tree (a simple connected graph with no cycles). You have to
 * remove as many edges from the tree as possible to obtain a forest with the
 * condition that : Each connected component of the forest should contain an
 * even number of vertices.
 * 
 * To accomplish this, you will remove some edges from the tree. Find out the
 * number of removed edges.
 * 
 * Input Format The first line of input contains two integers N and M. N is the
 * number of vertices and M is the number of edges. The next M lines contain two
 * integers ui and vi which specifies an edge of the tree. (1-based index)
 * 
 * Output Format Print the answer, a single integer.
 * 
 * Constraints 2 <= N <= 100.
 * 
 * Note: The tree in the input will be such that it can always be decomposed
 * into components containing even number of nodes.
 * 
 * Sample Input
 * 
 * 10 9 2 1 3 1 4 3 5 2 6 1 7 2 8 6 9 8 10 8 Sample Output
 * 
 * 2 Explanation On removing edges (1, 3) and (1, 6), we can get the desired
 * result.
 * 
 * Original tree:
 * 
 * 
 * Decomposed tree:
 * 
 * 
 * @author LXMRX
 *
 */
public class EvenTree
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int vertices = scanner.nextInt();
	int edgesCount = scanner.nextInt();
	int[][] edges = new int[edgesCount][2];

	for (int i = 0; i < edgesCount; i++)
	{
	    for (int j = 0; j < 2; j++)
		edges[i][j] = scanner.nextInt();
	}
	scanner.close();
    }

}
