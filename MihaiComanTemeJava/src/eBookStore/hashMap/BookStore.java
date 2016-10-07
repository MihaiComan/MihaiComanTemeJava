/*
 * MIhai Coman
 */
package eBookStore.hashMap;


import static eBookStore.hashMap.ArtAlbum.PaperQuality.BEST;
import static eBookStore.hashMap.ArtAlbum.PaperQuality.GOOD;
import static eBookStore.hashMap.ArtAlbum.PaperQuality.POOR;
import static eBookStore.hashMap.Novel.Genre.ADVENTURES;
import static eBookStore.hashMap.Novel.Genre.CRIME;
import static eBookStore.hashMap.Novel.Genre.ROMANCE;
import static eBookStore.hashMap.Novel.Genre.SF;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Level;

/**
 *
 * @author Mihai
 */
public class BookStore {
       
    
    
    public static void main(String[] args) {
            
             
        // create a list of evaluations
   
        Evaluation e1 = new Evaluation((float) 4,101,"The book tells the story "
                + "\n of the Foundation, an institute to preserve the best of galactic "
                + "\n civilization after the collapse of the Galactic Empire.");
        Evaluation e2 = new Evaluation((float) 3.5,102,"Cum va imaginati muzica clasica "
                + "\n transpusa in fotografie alb-negru? Ce au in comun intinderile din sudul Olteniei "
                + "\n de pe linga Dunare cu partiturile lui Brahms, Dvorak sau Sostakovic?");
        Evaluation e3 = new Evaluation((float) 4.5,103,"The Lord of the Rings is an epic high-fantasy novel "
                + "\n written by English author J. R. R. Tolkien. ");
        Evaluation e4 = new Evaluation(4,104,"Biblia pierdută este un bestseller scris de Igor Bergler. "
                + "\n S-a vândut în peste 82.000 de exemplare, la un an de la lansare, "
                + "\n devenind astfel cea mai vândută carte de ficțiune a unui autor român din ultimii 20 de ani.");
        Evaluation e5 = new Evaluation(3,105,"Albumul “Monumente din Bucuresti” prezinta, intr-o maniera plina de savoare "
                + "\n si cu ajutorul unei iconografii bogate, de multe ori inedita, cele mai importante repere ale orasului");
        Evaluation e6 = new Evaluation((float) 3.5,106,"Gathered in this volume anthology proves infinite wealth listings"
                + "\n in secular history of literature, from Hesiod to Joyce, from Ezekiel to Gadd.");
        Evaluation e7 = new Evaluation((float) 4.5,107,"nferno is a 2013 mystery thriller novel by American author Dan Brown "
                + "\n and the fourth book in his Robert Langdon series, following Angels & Demons, "
                + "\n The Da Vinci Code and The Lost Symbol.");
        Evaluation e8 = new Evaluation(4,108,"I, Robot is a collection of nine science fiction short stories by Isaac Asimov."
                + "\n The stories share a theme of the interaction of humans, robots, and morality, "
                + "\n and when combined they tell a larger story of Asimov's fictional history of robotics.");
        Evaluation e9 = new Evaluation((float) 3.5,109," is a series of high fantasy novels written by Terry Brooks,"
                + "\n which blends magic and primitive technology and is set in the Four Lands, which are identified as Earth "
                + "\n long after civilization was destroyed in a chemical and nuclear holocaust.");
        Evaluation e10 = new Evaluation(4,110,"Gone with the Wind is a novel written by Margaret Mitchell, "
                + "\n first published in 1936. The story is set in Clayton County and Atlanta, both in Georgia, "
                + "\n during the American Civil War and Reconstruction Era. ");
        Evaluation e11 = new Evaluation(3,111,"Vacations at last? Time to discover the most beautiful "
                + "\n and unusual travel destinations in the world.");
        Evaluation e12 = new Evaluation(4,111,"Travel destinations");
       
        // create a number of books
        
        Book b1 = new Novel("The Foundation",500,SF);       
        Book b2 = new ArtAlbum("Sonoro.Imagining Music", 178, GOOD);
        Book b3 = new Novel("The Lord of the Rings", 1000, ADVENTURES);
        Book b4 = new Novel("The Lost Bible",600,CRIME);
        Book b5 = new ArtAlbum("Bucharest Monuments",145,BEST);
        Book b6 = new ArtAlbum("Vertigo.The Infinite List",400,BEST);
        Book b7 = new Novel("Inferno",500,CRIME);
        Book b8 = new Novel("I,Robot",400,SF);
        Book b9 = new Novel("Shannara ",1500,ADVENTURES);
        Book b10 = new Novel("Gone with the Wind",600,ROMANCE);
        Book b11 = new ArtAlbum("Executive Escapes",220,POOR);
        
        
        // create a hashmap of evaluations for different books
        
        HashMap<Evaluation, Book> soldBooks = new HashMap<>();
         
         // add new entries to the map soldBooks
         
        soldBooks.put(e1,b1);
        soldBooks.put(e2,b2);
        soldBooks.put(e3,b3);
        soldBooks.put(e4,b4);
        soldBooks.put(e5,b5);
        soldBooks.put(e6,b6);
        soldBooks.put(e7,b7);
        soldBooks.put(e8,b8);
        soldBooks.put(e9,b9);
        soldBooks.put(e10,b10);
        soldBooks.put(e11,b11);
        // soldBooks.put(e12,b11);
         
     
        // Get a set of the entries
          
        Set<Map.Entry<Evaluation, Book>> entrySet1 = soldBooks.entrySet();
        Iterator<Entry<Evaluation, Book>> entrySetIterator = entrySet1.iterator();
        while (entrySetIterator.hasNext()) {
                       
            Entry entry;
            entry = (Entry)entrySetIterator.next();
            
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
            
        }
        
        // method to determine if there is a duplicate book in the map
        
        Map<Book, ArrayList<Evaluation>> reverseMap = new HashMap<>(); 
        
        soldBooks.entrySet().stream().map((entry) -> {
            if (!reverseMap.containsKey(entry.getValue())) {
                reverseMap.put(entry.getValue(), new ArrayList<>());
            }       return entry;
        }).forEach((entry) -> {
            ArrayList<Evaluation> keys = reverseMap.get(entry.getValue());
            keys.add(entry.getKey());
            reverseMap.put(entry.getValue(), keys);
        
        // method to compare if the User ID is the same for the same book
        
        if (keys.size()>1){
            for (int i = 0; i < keys.size(); i++) {
                for (int j = i+1; j < keys.size(); j++) {
                // compare list.get(i) and list.get(j)
                Evaluation current1=(Evaluation)keys.get(i);
                Evaluation current2=(Evaluation)keys.get(j);
                
                if (current1.getUser_ID()==current2.getUser_ID()){
                    try {
                        throw new ValidationException1("User ID should be unique for the same book");
                    } catch (ValidationException1 ex) {
                        java.util.logging.Logger.getLogger(BookStore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                }
            }
        }   
           
        });
      
    }
}


  

      
