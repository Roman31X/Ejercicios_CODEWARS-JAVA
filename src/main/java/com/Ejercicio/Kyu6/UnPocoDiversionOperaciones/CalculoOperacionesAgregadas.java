package com.Ejercicio.Kyu6.UnPocoDiversionOperaciones;

import java.util.stream.*;
import java.util.*;

public class CalculoOperacionesAgregadas {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment,
                Collectors.averagingDouble(Student::getGrade)));

    }
}
