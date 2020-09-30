package br.edu.utfpr.dv.sireata.model;

import static org.junit.jupiter.api.Assertions.*;

class OrgaoTest {

    Orgao or = new Orgao();

    @Before
    void setUp() {
         or.setIdOrgao(1);
    }

    @Test
    public void testGetId() {
        int result = or.getIdOrgao();
        assertEquals(1, result);
    }

}
