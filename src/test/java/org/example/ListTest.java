package org.example;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ListTest {
    @Test
    void Stacktest(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.showStack();
        stack.push(2);
        stack.peek();
    }
    @Test
    void QueueTest(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.showqueue();
    }
    @Test
    void ListTest(){
        //추가 삭제 테스트
        List listaddremove = new List();
        List listgetset = new List();
        List listfind = new List();
        listaddremove.add(0);
        listaddremove.add(1);
        listaddremove.add(0,2);
        System.out.println(listaddremove.size());
        listaddremove.valremove(2);
        listaddremove.remove(0);
        listaddremove.showarr();
        listaddremove.clear();

        //출력,수정 테스트
        listgetset.add(1);
        listgetset.add(2);
        System.out.println(listgetset.get(1));
        listgetset.set(0,3);

        //찾기 테스트
        listfind.add(1);
        listfind.add(2);
        listfind.add(3);
        System.out.println(listfind.indexOf(1));
        System.out.println(listfind.contains(1));

    }
    @Test
    void StackExTest(){
        //인덱스 벗어남
        Stack stack = new Stack();
        assertThrows(IndexOutOfBoundsException.class, ()->{
            stack.pop();
        });
        assertThrows(IndexOutOfBoundsException.class, ()->{
            stack.peek();
        });
        stack.showStack();
    }
    @Test
    void QueueExTest(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.showqueue();
        queue.dequeue();
        assertThrows(IndexOutOfBoundsException.class, ()->{
            queue.dequeue();
        });
        queue.showqueue();
    }
    @Test
    void ListExTest(){
        List list = new List();
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.add(-1,3);
        });
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.add(2,3);
        });
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.remove(3);
        });
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.remove(-1);
        });
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.get(1);
        });
        assertThrows(IndexOutOfBoundsException.class,()->{
            list.set(5,100);
        });

        System.out.println(list.indexOf(123));//없는 value값

    }
}