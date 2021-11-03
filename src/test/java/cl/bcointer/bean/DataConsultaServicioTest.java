package cl.bcointer.bean;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DataConsultaServicioTest {
	@Test
	void setNumbDtest() {
		DataConsultaServicio dcs = new DataConsultaServicio();
		String expected = "1,00";
		String actual = dcs.setNumbD("100");
		assertEquals(expected, actual);
	}
}