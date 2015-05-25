package it.reti.futureti.GildedRose;

import org.junit.Assert;
import org.junit.Test;

/**
 * Questa classe contieiene un esempio di un test che potrete utilizzare come "traccia"
 * per l'implementazione dei vostri nuovi casi di test.
 * 
 * Come vedete il metodo di test (in questo caso chiamato foo) è suddiviso in tre parti distinte:
 * - given: è una parte preparatoria al caso di test vero e proprio, in questa parte del metodo
 *   vengono create tutte le precondizioni necessarie a permettere l'esecuzione del test vero
 *   e proprio
 * - when: è la parte in cui viene eseguita l'operazione che si sta testando; configurate tutte le
 *   precondizioni in questa parte viene eseguita una specifica funzionalità sotto test (in questo
 *   caso viene eseguito il metodo UpdateQuality)
 * - then: è l'ultima parte del test e contiene le ferifiche che devono essere fatte per accertarsi
 *   che la funzionalità sotto test abbia prodotto i risultati attesi (in questo caso è presente
 *   un'Assert che non verifica nessuna caratteristica rilevante del metodo UpdateQuality, ma test
 *   reali dovranno invece verificare proprietà significative della funzionalità testata).
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
