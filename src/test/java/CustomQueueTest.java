import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    @Test
    void testEnqueueOnEmpty() throws Exception{
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        assertEquals("wera", queue.peek());
    }

    @Test
    void testDequeue() throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        queue.enqueue("kuba");
        queue.dequeue();
        assertEquals("kuba", queue.peek());
    }

    @Test
    void testIfEnqueueSetsRelations() throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        queue.enqueue("kuba");
        queue.enqueue("robert");
        queue.enqueue("zenonek");
        queue.dequeue();
        queue.dequeue();
        assertEquals("robert", queue.peek());
    }

    @Test
    void testSizeOnEmpty() {
        CustomQueue queue = new CustomQueue();
        assertEquals(0, queue.queueSize());
    }

    @Test
    void testSizeOnNonEmpty() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        queue.enqueue("kuba");
        queue.enqueue("robert");
        queue.enqueue("zenonek");
        assertEquals(4, queue.queueSize());

    }
}