/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial_2014;

/**
 *
 * @author brira
 */
import java.util.*;

class Partido {

    String equipo1;
    String equipo2;
    int golesEquipo1;
    int golesEquipo2;

    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
}

class Equipo implements Comparable<Equipo> {

    String nombre;
    int juegos, ganados, empatados, perdidos, golesFavor, golesContra, puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPartido(Partido partido) {
        juegos++;
        if (partido.equipo1.equals(nombre)) {
            golesFavor += partido.golesEquipo1;
            golesContra += partido.golesEquipo2;
            if (partido.golesEquipo1 > partido.golesEquipo2) {
                ganados++;
                puntos += 3;
            } else if (partido.golesEquipo1 == partido.golesEquipo2) {
                empatados++;
                puntos += 1;
            } else {
                perdidos++;
            }
        } else {
            golesFavor += partido.golesEquipo2;
            golesContra += partido.golesEquipo1;
            if (partido.golesEquipo2 > partido.golesEquipo1) {
                ganados++;
                puntos += 3;
            } else if (partido.golesEquipo2 == partido.golesEquipo1) {
                empatados++;
                puntos += 1;
            } else {
                perdidos++;
            }
        }
    }

    @Override
    public int compareTo(Equipo o) {
        if (puntos != o.puntos) {
            return o.puntos - puntos;
        }
        int diferenciaGoles = (golesFavor - golesContra) - (o.golesFavor - o.golesContra);
        if (diferenciaGoles != 0) {
            return diferenciaGoles;
        }
        if (golesFavor != o.golesFavor) {
            return o.golesFavor - golesFavor;
        }
        return 0;
    }
}

public class Mundial_2014 {

    public static void main(String[] args) {
        Map<String, List<Partido>> grupos = new HashMap<>();

        grupos.put("Grupo A", Arrays.asList(
                new Partido("Brasil", "Croacia", 3, 1),
                new Partido("Camerún", "México", 0, 1),
                new Partido("Brasil", "México", 0, 0),
                new Partido("Camerún", "Croacia", 0, 4),
                new Partido("Camerún", "Brasil", 1, 4),
                new Partido("Croacia", "México", 1, 3)
        ));

        grupos.put("Grupo B", Arrays.asList(
                new Partido("España", "Países Bajos", 1, 5),
                new Partido("Chile", "Australia", 3, 1),
                new Partido("Australia", "Países Bajos", 2, 3),
                new Partido("España", "Chile", 0, 2),
                new Partido("Australia", "España", 0, 3),
                new Partido("Países Bajos", "Chile", 2, 0)
        ));

// Agregar partidos para el Grupo C
        grupos.put("Grupo C", Arrays.asList(
                new Partido("Colombia", "Grecia", 3, 0),
                new Partido("Costa de Marfil", "Japón", 2, 1),
                new Partido("Colombia", "Costa de Marfil", 2, 1),
                new Partido("Japón", "Grecia", 0, 0),
                new Partido("Grecia", "Costa de Marfil", 2, 1),
                new Partido("Japón", "Colombia", 1, 4)
        ));

// Agregar partidos para el Grupo D
        grupos.put("Grupo D", Arrays.asList(
                new Partido("Uruguay", "Costa Rica", 1, 3),
                new Partido("Inglaterra", "Italia", 1, 2),
                new Partido("Uruguay", "Inglaterra", 2, 1),
                new Partido("Italia", "Costa Rica", 0, 1),
                new Partido("Italia", "Uruguay", 0, 1),
                new Partido("Costa Rica", "Inglaterra", 0, 0)
        ));

// Agregar partidos para el Grupo E
        grupos.put("Grupo E", Arrays.asList(
                new Partido("Suiza", "Ecuador", 2, 1),
                new Partido("Francia", "Honduras", 3, 0),
                new Partido("Suiza", "Francia", 2, 5),
                new Partido("Honduras", "Ecuador", 1, 2),
                new Partido("Honduras", "Suiza", 0, 3),
                new Partido("Ecuador", "Francia", 0, 0)
        ));

// Agregar partidos para el Grupo F
        grupos.put("Grupo F", Arrays.asList(
                new Partido("Argentina", "Bosnia-Herzegovina", 2, 1),
                new Partido("Irán", "Nigeria", 0, 0),
                new Partido("Argentina", "Irán", 1, 0),
                new Partido("Nigeria", "Bosnia-Herzegovina", 1, 0),
                new Partido("Nigeria", "Argentina", 2, 3),
                new Partido("Bosnia-Herzegovina", "Irán", 3, 1)
        ));

// Agregar partidos para el Grupo G
        grupos.put("Grupo G", Arrays.asList(
                new Partido("Alemania", "Portugal", 4, 0),
                new Partido("Ghana", "Estados Unidos", 1, 2),
                new Partido("Alemania", "Ghana", 2, 2),
                new Partido("Estados Unidos", "Portugal", 2, 2),
                new Partido("Estados Unidos", "Alemania", 0, 1),
                new Partido("Portugal", "Ghana", 2, 1)
        ));

// Agregar partidos para el Grupo H
        grupos.put("Grupo H", Arrays.asList(
                new Partido("Bélgica", "Argelia", 2, 1),
                new Partido("Rusia", "Corea del Sur", 1, 1),
                new Partido("Bélgica", "Rusia", 1, 0),
                new Partido("Corea del Sur", "Argelia", 2, 4),
                new Partido("Corea del Sur", "Bélgica", 0, 1),
                new Partido("Argelia", "Rusia", 1, 1)
        ));

        for (String nombreGrupo : grupos.keySet()) {
            System.out.println(nombreGrupo);
            System.out.println("J   G   E   P   GF   GC   DG   PT");
            List<Partido> partidos = grupos.get(nombreGrupo);
            Map<String, Equipo> equipos = new HashMap<>();
            for (Partido partido : partidos) {
                equipos.putIfAbsent(partido.equipo1, new Equipo(partido.equipo1));
                equipos.putIfAbsent(partido.equipo2, new Equipo(partido.equipo2));
                equipos.get(partido.equipo1).agregarPartido(partido);
                equipos.get(partido.equipo2).agregarPartido(partido);
            }
            List<Equipo> listaEquipos = new ArrayList<>(equipos.values());
            Collections.sort(listaEquipos);
            for (Equipo equipo : listaEquipos) {
                System.out.println(equipo.nombre + "   "
                        + equipo.juegos + "   "
                        + equipo.ganados + "   "
                        + equipo.empatados + "   "
                        + equipo.perdidos + "   "
                        + equipo.golesFavor + "   "
                        + equipo.golesContra + "   "
                        + (equipo.golesFavor - equipo.golesContra) + "   "
                        + equipo.puntos);
            }
            System.out.println();
        }
    }
}
