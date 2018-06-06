package com.example.jeroj.kenkenjj;

import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;
import com.example.jeroj.kenkenjj.models.Stats;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class APITests {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void test_get_grille() {

        APITest apitest = new APITest();
        Call<Grille> cm = apitest.get_grille("user_test");
        try {
            Response<Grille> rm = cm.execute();
            assertEquals(36, rm.body().getBlocks().size());
            assertNotEquals("0", String.valueOf(rm.body().getId_grille()));
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }


    @Test
    public void test_update_ken_game_victory() {
        APITest apitest = new APITest();
        Call<Grille> cm = apitest.get_grille("user_test");
        try {
            Response<Grille> rm = cm.execute();
            Call<RetourUpdate> cm2 = apitest.update_ken_game("user_test", rm.body().getId_grille(), 1);
            try {
                Response<RetourUpdate> rm2 = cm2.execute();
                assertEquals("OK", rm2.body().getStatus());
            } catch (IOException e) {
                assertTrue(false);
                e.printStackTrace();
            }
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }


    @Test
    public void test_update_ken_game_abandon() {
        APITest apitest = new APITest();
        Call<Grille> cm = apitest.get_grille("user_test");
        try {
            Response<Grille> rm = cm.execute();
            Call<RetourUpdate> cm2 = apitest.update_ken_game("user_test", rm.body().getId_grille(), 0);
            try {
                Response<RetourUpdate> rm2 = cm2.execute();
                assertEquals("OK", rm2.body().getStatus());
            } catch (IOException e) {
                assertTrue(false);
                e.printStackTrace();
            }
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }


    @Test
    public void test_update_ken_game_no_user_id() {
        APITest apitest = new APITest();
        Call<Grille> cm = apitest.get_grille("user_test");
        try {
            Response<Grille> rm = cm.execute();
            Call<RetourUpdate> cm2 = apitest.update_ken_game("", rm.body().getId_grille(), 1);
            try {
                Response<RetourUpdate> rm2 = cm2.execute();
                assertEquals("KO", rm2.body().getStatus());
            } catch (IOException e) {
                assertTrue(false);
                e.printStackTrace();
            }
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }



    @Test
    public void test_update_ken_game_no_id_grille() {
        APITest apitest = new APITest();
        Call<Grille> cm = apitest.get_grille("user_test");
        try {
            Response<Grille> rm = cm.execute();
            Call<RetourUpdate> cm2 = apitest.update_ken_game("user_test", 0, 1);
            try {
                Response<RetourUpdate> rm2 = cm2.execute();
                assertEquals("KO", rm2.body().getStatus());
            } catch (IOException e) {
                assertTrue(false);
                e.printStackTrace();
            }
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }


    @Test
    public void test_get_ken_stats_1() {
        APITest apitest = new APITest();
        Call<Stats> cm = apitest.get_ken_stats("user_test");
        try {
            Response<Stats> rm = cm.execute();

            assertNotEquals("0",  String.valueOf(rm.body().getPlayed()));
            assertNotEquals("0",  String.valueOf(rm.body().getResolved()));
            assertNotEquals("0",  String.valueOf(rm.body().getPourcentage()));

        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

    @Test
    public void test_get_ken_stats_2() {
        APITest apitest = new APITest();
        Call<Stats> cm = apitest.get_ken_stats("blablabla");
        try {
            Response<Stats> rm = cm.execute();

            assertEquals("0",  String.valueOf(rm.body().getPlayed()));
            assertEquals("0",  String.valueOf(rm.body().getResolved()));
            assertEquals("0",  String.valueOf(rm.body().getPourcentage()));

        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }
}