/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan32.daftarfilm;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====Daftar Film Sedang Tayang=====");
        Film film_a = new Film();
        film_a.filmName = "venom";
        film_a.filmGenre = "Action, Horor, Scifi";
        film_a.filmRating = 8.5;
        film_a.filmDuration = 120;
        
        Film film_b = new Film();
        film_b.filmName = "Small Foot";
        film_b.filmGenre = "Animation";
        film_b.filmRating = 9.0;
        film_b.filmDuration = 96;
        
        Film film_c = new Film();
        film_c.filmName = "Crazy Rich Asian";
        film_c.filmGenre = "Comedy";
        film_c.filmRating = 7.8;
        film_c.filmDuration = 119;
        
        Film film_d = new Film();
        film_d.filmName = "Asih";
        film_d.filmGenre = "Horor";
        film_d.filmRating = 6.0;
        film_d.filmDuration = 100;
        
        film_a.nowPlaying();
        film_b.nowPlaying();
        film_c.nowPlaying();
        film_d.nowPlaying();
        
        
    }
    
}
