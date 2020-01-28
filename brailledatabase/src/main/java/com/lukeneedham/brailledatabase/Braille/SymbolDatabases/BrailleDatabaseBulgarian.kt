

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_INFO
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_LETTERS_REP
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.INDICATOR
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R

class BrailleDatabaseSpanish : BrailleDatabase()
{

    override val dictionaryCategories = listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
            DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
            DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION))


    override val challengeSymbolTypes = listOf(LETTER)

    override val canDoTranslation = true

    override val wordSeparators = listOf(" ")

    /**
     * make the array of all the entries in the database
     * for each entry, make a new BrailleSymbolDatabaseEntry object, and pass the relevant paramaters
     * the available BrailleSymbolDatabaseEntry constructors and neccessary paramaters can be seen in BrailleSymbolDatabaseEntry.java
     * the last paramter is BrailleCellDatabaseEntry... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
     * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
     */

    override val symbols = entries {
        symbol {
            textRepresented = "а"
            dictionaryType = LETTER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "б"
            dictionaryType = LETTER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "в"
            dictionaryType = LETTER
            cells {
                +Cell2456
            }
        }
        symbol {
            textRepresented = "г"
            dictionaryType = LETTER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "д"
            dictionaryType = LETTER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "е"
            dictionaryType = LETTER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "ж"
            dictionaryType = LETTER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = "з"
            dictionaryType = LETTER
            cells {
                +Cell1356
            }
        }
        symbol {
            textRepresented = "и"
            dictionaryType = LETTER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "й"
            dictionaryType = LETTER
            cells {
                +Cell13456
                +Cell12346
            }
        }
        symbol {
            textRepresented = "к"
            dictionaryType = LETTER
            cells {
                +Cell13
            }
        }
        symbol {
            textRepresented = "л"
            dictionaryType = LETTER
            cells {
                +Cell123
            }
        }
        symbol {
            textRepresented = "м"
            dictionaryType = LETTER
            cells {
                +Cell134
            }
        }
        symbol {
            textRepresented = "н"
            dictionaryType = LETTER
            cells {
                +Cell1345
            }
        }
        symbol {
            textRepresented = "о"
            dictionaryType = LETTER
            cells {
                +Cell135
            }
        }
        symbol {
            textRepresented = "п"
            dictionaryType = LETTER
            cells {
                +Cell1234
            }
        }
        symbol {
            textRepresented = "р"
            dictionaryType = LETTER
            cells {
                +Cell1235
            }
        }
        symbol {
            textRepresented = "с"
            dictionaryType = LETTER
            cells {
                +Cell234
            }
        }
        symbol {
            textRepresented = "т"
            dictionaryType = LETTER
            cells {
                +Cell2345
            }
        }
        symbol {
            textRepresented = "у"
            dictionaryType = LETTER
            cells {
                +Cell136
            }
        }
        symbol {
            textRepresented = "ф"
            dictionaryType = LETTER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "х"
            dictionaryType = LETTER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "ц"
            dictionaryType = LETTER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "ч"
            dictionaryType = LETTER
            cells {
                +Cell12345
            }
        }
        symbol {
            textRepresented = "ш"
            dictionaryType = LETTER
            cells {
                +Cell156
            }
        }
        symbol {
            textRepresented = "щ"
            dictionaryType = LETTER
            cells {
                +Cell1346
            }
        }
        symbol {
            textRepresented = "ъ"
            dictionaryType = LETTER
            cells {
                +Cell12356
            }
        }
        symbol {
            textRepresented = "ь"
            dictionaryType = LETTER
            cells {
                +Cell23456
            }
        }
        symbol {
            textRepresented = "ю"
            dictionaryType = LETTER
            cells {
                +Cell1256
            }
        }
        symbol {
            textRepresented = "я"
            dictionaryType = LETTER
            cells {
                +Cell1246
            }
        
        }
        symbol {
            textRepresented = ""
            dictionaryType = NUMBER
            cells {
                +Cell236
                +Cell356
            }
            descriptiveNameRes = R.string.braille_number_sign
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.numbersExplanation
            fillEntryWidth = true
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "1"
            dictionaryType = NUMBER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "2"
            dictionaryType = NUMBER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "3"
            dictionaryType = NUMBER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "4"
            dictionaryType = NUMBER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "5"
            dictionaryType = NUMBER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "6"
            dictionaryType = NUMBER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "7"
            dictionaryType = NUMBER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "8"
            dictionaryType = NUMBER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "9"
            dictionaryType = NUMBER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "0"
            dictionaryType = NUMBER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = ","
            dictionaryType = NUMBER
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_decimal_point
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "."
            dictionaryType = NUMBER
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_thousands_separator
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = " "
            dictionaryType = INVISIBLE
            cells {
                +CellEmpty
            }
        }
        symbol {
            textRepresented = "."
            dictionaryType = PUNCTUATION
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_fullstop
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "?"
            dictionaryType = PUNCTUATION
            cells {
                +Cell26
            }
            descriptiveNameRes = R.string.braille_questionmark
            onEntryClickType = SHOW_LETTERS_REP
      
        }
        symbol {
            textRepresented = "“"
            dictionaryType = PUNCTUATION
            cells {
                +Cell236
            }
            descriptiveNameRes = R.string.braille_openquote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "!"
            dictionaryType = PUNCTUATION
            cells {
                +Cell235
            }
            descriptiveNameRes = R.string.braille_exclamationmark
            onEntryClickType = SHOW_LETTERS_REP
 
        }
        symbol {
            textRepresented = ","
            dictionaryType = PUNCTUATION
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_comma
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ":"
            dictionaryType = PUNCTUATION
            cells {
                +Cell25
            }
            descriptiveNameRes = R.string.braille_colon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ";"
            dictionaryType = PUNCTUATION
            cells {
                +Cell23
            }
            descriptiveNameRes = R.string.braille_semicolon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "'"
            dictionaryType = PUNCTUATION
            cells {
                +Cell3
            }
            descriptiveNameRes = R.string.braille_apostrophe
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "-"
            dictionaryType = PUNCTUATION
            cells {
                +Cell36
            }
            descriptiveNameRes = R.string.braille_hyphen
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "”"
            dictionaryType = PUNCTUATION
            cells {
                +Cell356
            }
            descriptiveNameRes = R.string.braille_closequote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_lettersign
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.lettersignExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell46
            }
            descriptiveNameRes = R.string.braille_capital
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.capitalsignExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell6
                +Cell6
            }
            descriptiveNameRes = R.string.braille_capitalword
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.capitalwordExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "*"
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
                +Cell35
            }
            descriptiveNameRes = R.string.braille_asterisk
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "("
            dictionaryType = PUNCTUATION
            cells {
                +Cell2356
               
            }
            descriptiveNameRes = R.string.braille_openbracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ")"
            dictionaryType = PUNCTUATION
            cells {
                +Cell2356
              
            }
            descriptiveNameRes = R.string.braille_closebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "/"
            dictionaryType = PUNCTUATION
            cells {
                +Cell456
                +Cell34
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell5
            }
            descriptiveNameRes = R.string.braille_dots5
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell45
            }
            descriptiveNameRes = R.string.braille_dots45
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell456
            }
            descriptiveNameRes = R.string.braille_dots456
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell46
            }
            descriptiveNameRes = R.string.braille_dots46
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_dots56
        }
    }
}
