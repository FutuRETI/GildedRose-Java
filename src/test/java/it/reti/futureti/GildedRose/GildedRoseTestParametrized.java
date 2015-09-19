package it.reti.futureti.GildedRose;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Questa classe contiene un esempio di un test che potrete utilizzare come "traccia"
 * per l'implementazione dei vostri nuovi casi di test.
 * 
 * Come vedete il metodo di test (in questo caso chiamato foo) Ë suddiviso in tre parti distinte:
 * - given: Ë una parte preparatoria al caso di test vero e proprio, in questa parte del metodo
 *   vengono create tutte le precondizioni necessarie a permettere l'esecuzione del test vero
 *   e proprio
 * - when: Ë la parte in cui viene eseguita l'operazione che si sta testando; configurate tutte le
 *   precondizioni in questa parte viene eseguita una specifica funzionalit√† sotto test (in questo
 *   caso viene eseguito il metodo UpdateQuality)
 * - then: Ë l'ultima parte del test e contiene le ferifiche che devono essere fatte per accertarsi
 *   che la funzionalit‡ sotto test abbia prodotto i risultati attesi (in questo caso Ë presente
 *   un'Assert che non verifica nessuna caratteristica rilevante del metodo UpdateQuality, ma test
 *   reali dovranno invece verificare propriet√† significative della funzionalit‡ testata).
 *   
 * Consigliamo di sviluppare tutti i test mantenendo questa struttura (proprio comprensiva anche delle
 * tre righe di commento che permettano di identificare le varie parti del metodo di test).
 **/
@RunWith(Parameterized.class)
public class GildedRoseTestParametrized {
	@Parameters(name="Test for item {0} (quality = {2} and sellIn = {1})")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				// itemName, itemSellIn, itemQuality, expectedSellIn, expectedQuality 
				{ "foo", 0, 0, -1, 0 },
				{ "Aged Brie", 0, 0, -1, 2 },
		});
	}
	
	private String itemName = null;
	private int itemSellIn = 0;
	private int itemQuality = 0;
	private int expectedSellIn = 0;
	private int expectedQuality = 0;
	
	public GildedRoseTestParametrized(String itemName, int itemSellIn, int itemQuality, int expectedSellIn, int expectedQuality) {
		this.itemName = itemName;
		this.itemSellIn = itemSellIn;
		this.itemQuality = itemQuality;
		this.expectedSellIn = expectedSellIn;
		this.expectedQuality = expectedQuality;
	}
	
    @Test
    public void testUpdateQualityItem() {
        // given
        Item[] items = { new Item(itemName, itemSellIn, itemQuality) };
        GildedRose app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        Assert.assertEquals(itemName, items[0].name);
        Assert.assertEquals(expectedSellIn, items[0].sellIn);
        Assert.assertEquals(expectedQuality, items[0].quality);
    }
}
