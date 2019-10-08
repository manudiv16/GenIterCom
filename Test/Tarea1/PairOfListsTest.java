package Tarea1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairOfListsTest {
    @Test
    void tes1() {
        int pivot = 20;
        List<Integer> lint = List.of(1, 23, 5, 42, 10, 3, 54, 22, 6);
        PairOfLists pair = Partitioned.partition(lint, pivot);
        assertTrue(checkMore(pair.getFirst(),pivot));
        assertTrue(checkMenor(pair.getSecond(),pivot));
    }

    boolean checkMore(List<Integer> list, int pivot) {
        for (Integer num : list) {
            if (pivot < num) {
                return false;
            }
        }
        return true;

    }

    boolean checkMenor(List<Integer> list, int pivot) {
        for (Integer num : list) {
            if (num <= pivot) {
                return false;
            }
        }
        return true;

    }
}