package problems;

import static org.junit.Assert.*;

import org.junit.Test;

import adt.linkedList.SingleLinkedListNode;

public class MyTest {
	
	LinkedListMergeImpl<Integer> teste = new LinkedListMergeImpl<Integer>();
	SingleLinkedListNode<Integer> node1 = new SingleLinkedListNode<Integer>();
	SingleLinkedListNode<Integer> node2 = new SingleLinkedListNode<Integer>();
	
	
	@Test
	public void test01() {
		node1.setData(9);
		SingleLinkedListNode<Integer> proxNode1 = new SingleLinkedListNode<Integer>(10, new SingleLinkedListNode<Integer>());
		node1.setNext(proxNode1);
		
		node2.setData(1);
		SingleLinkedListNode<Integer> proxNode2 = new SingleLinkedListNode<Integer>(11, new SingleLinkedListNode<Integer>());
		node2.setNext(proxNode2);
		
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 1);
		assertEquals(out.getNext().getData(), (Integer) 9);
		assertEquals(out.getNext().getNext().getData(), (Integer) 10);
		assertEquals(out.getNext().getNext().getNext().getData(), (Integer) 11);
		assertEquals(out.getNext().getNext().getNext().getNext().getData(), null);
		assertTrue(out.getNext().getNext().getNext().getNext().isNIL());
	}
	
	@Test
	public void test02() {
		node1.setData(9);
		SingleLinkedListNode<Integer> proxNode1 = new SingleLinkedListNode<Integer>(10, new SingleLinkedListNode<Integer>());
		node1.setNext(proxNode1);
			
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 9);
		assertEquals(out.getNext().getData(), (Integer) 10);
		assertEquals(out.getNext().getNext().getData(), null);
		assertTrue(out.getNext().getNext().isNIL());

	}
	
	@Test
	public void test03() {

		
		node2.setData(1);
		SingleLinkedListNode<Integer> proxNode2 = new SingleLinkedListNode<Integer>(11, new SingleLinkedListNode<Integer>());
		node2.setNext(proxNode2);
		
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 1);
		assertEquals(out.getNext().getData(), (Integer) 11);
		assertEquals(out.getNext().getNext().getData(), null);
		assertTrue(out.getNext().getNext().isNIL());

	}
	
	@Test
	public void test04() {

		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), null);
		assertEquals(out.getNext(), null);
		assertTrue(out.isNIL());

	}
	
	@Test
	public void test05() {

		
		node2.setData(1);
		node2.setNext(new SingleLinkedListNode<Integer>());
		
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 1);
		assertEquals(out.getNext().getData(), null);
		assertTrue(out.getNext().isNIL());
	}
	
	@Test
	public void test06() {

		node1.setData(1000);
		node1.setNext(new SingleLinkedListNode<Integer>());
		
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 1000);
		assertEquals(out.getNext().getData(), null);
		assertTrue(out.getNext().isNIL());
	}
	
	@Test
	public void test07() {
		
		node1.setData(1000);
		node1.setNext(new SingleLinkedListNode<Integer>());
		
		node2.setData(1);
		node2.setNext(new SingleLinkedListNode<Integer>());
		
		SingleLinkedListNode<Integer> out = teste.merge(node1, node2);
		assertEquals(out.getData(), (Integer) 1);
		assertEquals(out.getNext().getData(), (Integer) 1000);
		assertEquals(out.getNext().getNext().getData(), null);
		assertTrue(out.getNext().getNext().isNIL());
	}
	

}
