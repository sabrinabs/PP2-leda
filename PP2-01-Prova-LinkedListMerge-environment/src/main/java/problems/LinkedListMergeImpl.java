package problems;

import adt.linkedList.SingleLinkedListNode;

public class LinkedListMergeImpl<T extends Comparable<T>> implements LinkedListMerge<T> {

	public SingleLinkedListNode<T> merge(SingleLinkedListNode<T> node1, SingleLinkedListNode<T> node2) {

		SingleLinkedListNode<T> out = new SingleLinkedListNode<T>();
		SingleLinkedListNode<T> aux = out;

		SingleLinkedListNode<T> apontador1 = node1;
		SingleLinkedListNode<T> apontador2 = node2;

		while (!apontador1.isNIL() && !apontador2.isNIL()) {

			if (apontador1.getData().compareTo(apontador2.getData()) < 0) {
				aux.setNext(apontador1);
				apontador1 = apontador1.getNext();
			} else {
				aux.setNext(apontador2);
				apontador2 = apontador2.getNext();
			}
			aux = aux.getNext();
		}

		while (!apontador1.isNIL()) {
			aux.setNext(apontador1);
			apontador1 = apontador1.getNext();
			aux = aux.getNext();
		}
		
		while (!apontador2.isNIL()) {
			aux.setNext(apontador2);
			apontador2 = apontador2.getNext();
			aux = aux.getNext();
		}
		

		aux.setNext(new SingleLinkedListNode<T>());
		out = out.getNext();

		return out;
	}
}
