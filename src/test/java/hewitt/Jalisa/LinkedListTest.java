package hewitt.Jalisa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jalisahewitt on 10/20/16.
 */
public class LinkedListTest {

    LinkedList list;
    @Before

    public void setup(){
        list=new LinkedList();
        list.add(15);
    }

    @Test
    public void sizeTest(){
        list.add(5);
        int expected = 2;
        int actual = list.size();
        assertEquals("Should return size of list", expected, actual);

    }

    @Test
    public void sizeTest2(){
        list.add(5);
        list.add(15);
        list.add(25);
        int expected = 4;
        int actual = list.size();
        assertEquals("Should return size of list", expected, actual);

    }

    @Test
    public void addTest(){
        list.add(10);
        int expected = 2;
        int actual = list.size();
        assertEquals("Should have added a node", expected, actual);
    }

    @Test
    public void remove(){
        list.add(20);
        list.add(25);
        list.remove(2);
        int expected = 2;
        int actual = list.size();
        assertEquals("Should have removed a node", expected, actual);
    }

    @Test
    public void remove2(){
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(45);
        list.remove(4);
        int expected = 4;
        int actual = list.size();
        assertEquals("Should have removed a node", expected, actual);
    }

    @Test
    public void containsTest(){
        list.add(40);
        list.add(30);
        list.add(45);
        boolean expected = true;
        boolean actual = list.contains(45);
        assertEquals("Should have returned true", expected, actual);
    }

    @Test
    public void containsTest2(){
        list.add(40);
        list.add(30);
        list.add(45);
        list.add(50);
        boolean expected = false;
        boolean actual = list.contains(0);
        assertEquals("Should have returned false", expected, actual);
    }

    @Test
    public void findTest(){
        list.add(33);
        list.add(7);
        list.add(45);
        list.add(50);
        int expected = 2;
        int actual = list.find(7);
        assertEquals("Should have returned the index of that element", expected, actual);
    }

    @Test
    public void findTest2(){
        list.add(33);
        list.add(7);
        list.add(45);
        list.add(50);
        int expected = 1;
        int actual = list.find(45);
        assertEquals("Should have returned the index of that element", expected, actual);
    }

    @Test
    public void getTest(){
        list.add(80);
        list.add(3);
        int expected = 15;
        int actual = list.get(2);
        assertEquals("Should have added a node", expected, actual);
    }

    @Test
    public void getTest2(){
        list.add(80);
        list.add(3);
        list.add(30);
        list.add(45);
        int expected = 80;
        int actual = list.get(3);
        assertEquals("Should have added a node", expected, actual);
    }

    @Test
    public void copyTest(){
        list.add(3);
        list.add(30);
        list.add(45);
        int expected = 4;
        LinkedList actual = list.copy();
        assertEquals("Should have copied the list and returned it", expected, actual);


    }




}
