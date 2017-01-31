package main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Uff, czyz nie swierzba Cie rece by samemu stworzyc testy? Spojrz na klase
 * {@code StudentCouncil} - reprezentuje ona rade uczniow. Zapozniaj sie z nia.
 * 
 * PYTAJCIE, PYTAJCIE, PYTAJCIE - prowadzacego, siebie nawzajem, wasatego wujka
 * Google i ciocie Stack Overflow.
 * 
 * Stworz testy sprawdzajace nastepujace funkcjonalnosci: - Dodawanie studenta -
 * Dodawanie 10 studentow - Usuwanie studenta - Usuniecie >1 studentow. - -
 * Pobieranie lidera, kiedy nikogo nie ma - Udane pobieranie lidera - Wybor
 * nowego lidera, kiedy nikogo nie ma - Udane wybieranie nowego lidera.
 * 
 * Po tym jak uda Ci sie napisac testy, wez kilka glebokich wdechow i zastanow
 * sie co mozna poprawic. Jesli wszystko jest wspaniale, sprobuj rozwiazac
 * ponizsze zadania: - Czy mozna napisac test badajacy w jakiej kolejnosci
 * znajduja sie studenci? Jesli tak, stworz taki test. - Stworz metode, ktora
 * bedzie wybierala na lidera studenta o danym imieniu. Jesli nie ma studenta o
 * danym imieniu, metoda powinna rzucac {@code IllegalArgumentException}.
 * Oczywisice testy rowniez.
 */
public class StudentCouncilExercise {

    private StudentCouncil council;

    @Before
    public void before() {
        council = new StudentCouncil(new ArrayList<String>());
    }

    @Test
    public void testAddition() {
        council.addStudent("Piotrek");
        List<String> retrievedStudents = council.getStudents();
        assertThat(retrievedStudents.size(), is(1));
        assertThat(retrievedStudents.get(0), is("Piotrek"));
    }

    @Test
    public void testAddTen() {
        List<String> addedStudents = saveNumberOfStudents(council, 100);
        List<String> retrievedStudents = council.getStudents();
        checkMultiple(addedStudents, retrievedStudents);
    }

    @Test
    public void testRemoval() {
        council.addStudent("Piotrek");
        List<String> retrievedStudents = council.getStudents();
        assertThat(retrievedStudents.size(), is(1));
        assertThat(retrievedStudents.get(0), is("Piotrek"));
        council.removeStudent("Piotrek");
        assertThat(council.getStudents().size(), is(0));
    }

    @Test
    public void testRemovalMultiple() {
        List<String> addedStudents = saveNumberOfStudents(council, 100);
        List<String> restStudents = new ArrayList<String>();
        for (int i = 0; i < addedStudents.size(); i++) {
            if (i % 3 == 0) {
                council.removeStudent(addedStudents.get(i));
            } else {
                restStudents.add(addedStudents.get(i));
            }
        }
        List<String> retrievedStudents = council.getStudents();
        checkMultiple(restStudents, retrievedStudents);
    }

    @Test(expected = IllegalStateException.class)
    public void gettingLeaderOnEmptyCouncilShouldThrowAnException() {
        council.getLeader();
    }

    @Test
    public void getLeaderSuccess() {
        List<String> addedStudents = saveNumberOfStudents(council, 2);
        assertTrue(addedStudents.contains(council.getLeader()));
    }

    @Test
    public void choosingLeaderOnEmptyCouncilShouldThrowAnException() {
        try {
            council.electNewLeader();
            fail();
        } catch (IllegalStateException ise) {
            assertThat(ise.getMessage(), is("No students to choose from."));
        }
    }

    @Test
    public void chooseLeaderSuccess() {
        List<String> addedStudents = saveNumberOfStudents(council, 10);
        council.electNewLeader();
        assertTrue(addedStudents.contains(council.getLeader()));
    }

    private void checkMultiple(List<String> studentsToAdd,
                    List<String> retrievedStudents) {
        assertThat(retrievedStudents.size(), is(studentsToAdd.size()));
        for (String student : studentsToAdd) {
            assertThat(retrievedStudents.contains(student), is(true));
        }
    }

    private List<String> saveNumberOfStudents(StudentCouncil council, int count) {
        List<String> studentsToAdd = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            studentsToAdd.add("Klon numer " + i);
        }
        for (String student : studentsToAdd) {
            council.addStudent(student);
        }
        return studentsToAdd;
    }
}

