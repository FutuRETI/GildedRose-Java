package it.reti.futureti.GildedRose;

import org.junit.Assert;
import org.junit.Test;

/**
 * Questa classe contieiene un esempio di un test che potrete utilizzare come "traccia"
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
    public class GildedRoseTest {
        @Test
        public void foo() {
            // given
            String itemName = "foo";
            int itemSellIn = 0;
            int itemQuality = 0;

            Item[] items = { new Item(itemName, itemSellIn, itemQuality) };
            GildedRose app = new GildedRose(items);

            // when
            app.updateQuality();

            // then
            Assert.assertEquals(itemName, items[0].name);
        }
    }
