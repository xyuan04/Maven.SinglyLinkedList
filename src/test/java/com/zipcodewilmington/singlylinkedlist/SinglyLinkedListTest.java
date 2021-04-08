package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAddNode() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();

        //When:
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //Then:
        Assert.assertEquals(3, singly.size());
    }

    @Test
    public void testRemoveNode() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        singly.removeNode(1);

        //Then:
        Assert.assertEquals(2, singly.size());
    }

    @Test
    public void testRemoveNodeFirst() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        singly.removeNode(0);

        //Then:
        Assert.assertEquals(2, singly.size());
    }

    @Test
    public void testRemoveNodeLast() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        singly.removeNode(2);

        //Then:
        Assert.assertEquals(2, singly.size());
    }

    @Test
    public void testRemoveNodeNull() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);

        //When:
        singly.removeNode(0);

        //Then:
        Assert.assertEquals(0, singly.size());
    }

    @Test
    public void testContainsNode() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        boolean actual = singly.contains(2);

        //Then:
        Assert.assertTrue(actual);
    }

    @Test
    public void testContainsNodeFalse() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        boolean actual = singly.contains(10);

        //Then:
        Assert.assertFalse(actual);
    }

    @Test
    public void testFind() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(5);
        singly.addNode(2);
        singly.addNode(3);

        //When:
        int expected = 2;
        int actual = singly.find(3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindString() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        int expected = 5;
        int actual = singly.find("Dolio");

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindStringNotInList() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        int expected = -1;
        int actual = singly.find("Nope");

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        String expected = "Xiong";
        String actual = singly.get(3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNull() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        String expected = null;
        String actual = singly.get(10);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        SinglyLinkedList<String> copy = singly.copy(singly);
        String expected = singly.get(3);
        String actual = copy.get(3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort() {
        //Given:
        SinglyLinkedList<String> singly = new SinglyLinkedList<String>();
        singly.addNode("Hello");
        singly.addNode("World");
        singly.addNode("Zipcode");
        singly.addNode("Xiong");
        singly.addNode("Mike");
        singly.addNode("Dolio");
        singly.addNode("Nobles");
        singly.addNode("Younger");

        //When:
        SinglyLinkedList<String> sortedList = singly.sort(singly);
        String expected = "Nobles";
        String actual = sortedList.get(3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortIntegers() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(69);
        singly.addNode(420);
        singly.addNode(6);
        singly.addNode(9);
        singly.addNode(20);
        singly.addNode(423);
        singly.addNode(84);
        singly.addNode(74);

        //When:
        SinglyLinkedList<Integer> sortedList = singly.sort(singly);
        int expected = 69;
        int actual = sortedList.get(3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        //Given:
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();
        singly.addNode(69);
        singly.addNode(420);
        singly.addNode(6);
        singly.addNode(9);
        singly.addNode(20);
        singly.addNode(423);
        singly.addNode(84);
        singly.addNode(74);

        //When:
        SinglyLinkedList<Integer> sortedList = singly.reverse(singly);
        int expected = 74;
        int actual = sortedList.get(0);

        //Then:
        Assert.assertEquals(expected, actual);
    }
}
