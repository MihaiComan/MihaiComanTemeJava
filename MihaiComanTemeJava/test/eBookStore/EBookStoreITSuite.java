/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gheorgheaurelpacurar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({eBookStore.NotExistingBookIT.class, eBookStore.BookIT.class, eBookStore.ArtAlbumIT.class, eBookStore.NovelIT.class, eBookStore.BookStoreIT.class})
public class EBookStoreITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
