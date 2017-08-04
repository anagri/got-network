package com.bootcamp.b17;

public class Constants {
    public static final int STARK = 1;
    public static final int LANNISTER = 2;
    public static final int BARATHEON = 3;
    public static final int TARGARYEN = 4;
    public static final int BOLTON = 5;
    public static final int DOTHRAKI = 6;
    public static final int FACELESS_MEN = 7;

    public static final String SERVER_URL = "https://s3-ap-southeast-1.amazonaws.com/android-bootcamp-assets/";
    public static final GoTCharacter[] GOT_CHARACTERS = {
            new GoTCharacter(0, "Arya Stark", SERVER_URL + "arya.jpg", SERVER_URL + "arya_full.jpg", true, STARK, "Arya Stark is the third child and " +
                    "second daughter of Lord Eddard Stark and Lady Catelyn Tully"),
            new GoTCharacter(0, "Bran Stark", SERVER_URL + "bran.jpg", SERVER_URL + "bran_full.jpg", true, STARK, "Brandon Stark, typically called Bran," +
                    " is the second son of Lord Eddard Stark and Lady Catelyn Tully."),
            new GoTCharacter(0, "Brienne Tarth", SERVER_URL + "brienne.jpg", SERVER_URL + "brienne_full.jpg", true, STARK, "Brienne is sometimes called " +
                    "the Ma0 of Tarth and mocked as Brienne the Beauty."),
            new GoTCharacter(0, "Catelyn Stark", SERVER_URL + "catelyn.jpg", SERVER_URL + "catelyn_full.jpg", false, STARK, "Lady Catelyn Stark, also " +
                    "called Catelyn Tully, is the wife of Lord Eddard Stark and Lady of Winterfell."),
            new GoTCharacter(0, "Cercei Lannister", SERVER_URL + "cercei.jpg", SERVER_URL + "cercei_full.jpg", true, LANNISTER, "Cersei Lannister is" +
                    " the eldest child of Tywin and Joanna Lannister by mere moments, and the twin sister of Jaime Lannister."),
            new GoTCharacter(0, "Daenerys Targaryen", SERVER_URL + "daenerys.jpg", SERVER_URL + "daenerys_full.jpg", true, TARGARYEN, "Princess " +
                    "Daenerys Targaryen, known as Daenerys Stormborn and Dany, is one of the last confirmed members of House Targaryen"),
            new GoTCharacter(0, "Davos Seaworth", SERVER_URL + "davos.jpg", SERVER_URL + "davos_full.jpg", true, BARATHEON, "Ser Davos Seaworth, " +
                    "commonly called the Onion Knight, is the head of House Seaworth. He was once a smuggler."),
            new GoTCharacter(0, "Eddard Stark", SERVER_URL + "eddard.jpg", SERVER_URL + "eddard_full.jpg", false, STARK, "Eddard Stark, also " +
                    "affectionately called 'Ned', is the head of House Stark, Lord of Winterfell, and Warden of the North."),
            new GoTCharacter(0, "Hodor", SERVER_URL + "hodor.jpg", SERVER_URL + "hodor_full.jpg", true, STARK, "Hodor, the giant, simple-minded " +
                    "stableboy of Winterfell."),
            new GoTCharacter(0, "Jaime Lannister", SERVER_URL + "jaime.jpg", SERVER_URL + "jaime_full.jpg", true, LANNISTER, "Ser Jaime Lannister, " +
                    "known as the Kingslayer, is a knight from House Lannister. He is the twin brother of Queen Cersei Lannister."),
            new GoTCharacter(0, "Jaqen Hagar", SERVER_URL + "jaqen.jpg", SERVER_URL + "jaqen_full.jpg", true, FACELESS_MEN, "Jaqen Hagar is the name " +
                    "of a sly Lorathi criminal who meets Arya Stark on her way to the Wall."),
            new GoTCharacter(0, "Joffrey Baratheon", SERVER_URL + "joffrey.jpg", SERVER_URL + "joffrey_full.jpg", false, BARATHEON, "Prince Joffrey " +
                    "Baratheon is known to the Seven Kingdoms as the eldest son and heir of King Robert I Baratheon and Queen Cersei Lannister."),
            new GoTCharacter(0, "Jon Snow", SERVER_URL + "jon.jpg", SERVER_URL + "jon_full.jpg", false, STARK, "Jon Snow doesn't know anything"),
            new GoTCharacter(0, "Khal Drogo", SERVER_URL + "khal.jpg", SERVER_URL + "khal_full.jpg", false, DOTHRAKI, "Drogo is a powerful khal or " +
                    "warlord of the fearsome Dothraki nomads."),
            new GoTCharacter(0, "Melisandre", SERVER_URL + "melisandre.jpg", SERVER_URL + "melisandre_full.jpg", true, BARATHEON, "Melisandre is a " +
                    "priestess of R'hllor and a shadowbinder, hailing from the eastern city of Asshai. She has joined the entourage of Stannis Baratheon."),
            new GoTCharacter(0, "Petyr Baelish", SERVER_URL + "petyr.jpg", SERVER_URL + "petyr_full.jpg", true, LANNISTER, "Petyr Baelish, sometimes" +
                    " called Littlefinger, is the head of House Baelish of the Fingers. Petyr wears a mockingbird as his personal crest instead of House Baelish's sigil," +
                    " a titan's head."),
            new GoTCharacter(0, "Podrick Payne", SERVER_URL + "podrick.jpg", SERVER_URL + "podrick_full.jpg", true, LANNISTER, "Podrick Payne is the" +
                    " squire of Tyrion Lannister. He is from a cadet branch of House Payne."),
            new GoTCharacter(0, "Grand Maester Pycelle", SERVER_URL + "pycelle.jpg", SERVER_URL + "pycelle_full.jpg", true, LANNISTER, "Pycelle is a" +
                    " Grand Maester of the Citadel who has served in King's Landing and on the small council for over forty years."),
            new GoTCharacter(0, "Ramsay Bolton", SERVER_URL + "ramsay.jpg", SERVER_URL + "ramsay_full.jpg", true, BOLTON, "Ramsay Bolton (formerly " +
                    "Ramsay Snow) is the legitimized bastard son of Lord Roose Bolton. He is known as the Bastard of Bolton and the Bastard of the Dreadfort."),
            new GoTCharacter(0, "Renly Baratheon", SERVER_URL + "renly.jpg", SERVER_URL + "renly_full.jpg", false, BARATHEON, "Renly Baratheon is " +
                    "the Lord of Storm's End and Lord Paramount of the Stormlands. The younger brother of King Robert I and Lord Stannis."),
            new GoTCharacter(0, "Robb Stark", SERVER_URL + "robb.jpg", SERVER_URL + "robb_full.jpg", false, STARK, "Robb Stark is the eldest son of " +
                    "Eddard Stark and Catelyn Tully and is the heir of House Stark to Winterfell and the north."),
            new GoTCharacter(0, "Robert Baratheon", SERVER_URL + "robert.jpg", SERVER_URL + "robert_full.jpg", false, BARATHEON, "King Robert I " +
                    "Baratheon is the Lord of the Seven Kingdoms of Westeros and the head of House Baratheon of King's Landing"),
            new GoTCharacter(0, "Roose Bolton", SERVER_URL + "roose.jpg", SERVER_URL + "roose_full.jpg", true, BOLTON, "Roose Bolton is the Lord of the" +
                    " Dreadfort and head of House Bolton."),
            new GoTCharacter(0, "Sansa Stark", SERVER_URL + "sansa.jpg", SERVER_URL + "sansa_full.jpg", true, STARK, "Arya Stark is the third child and " +
                    "second daughter of Lord Eddard Stark and Lady Catelyn Tully."),
            new GoTCharacter(0, "Stannis Baratheon", SERVER_URL + "stannis.jpg", SERVER_URL + "stannis_full.jpg", false, BARATHEON, "Stannis " +
                    "Baratheon is the head of House Baratheon of Dragonstone and the Lord of Dragonstone."),
            new GoTCharacter(0, "Tyrion Lannister", SERVER_URL + "tyrion.jpg", SERVER_URL + "tyrion_full.jpg", true, LANNISTER, "Tyrion is a dwarf, " +
                    "with stubby legs, a jutting forehead, mismatched eyes of green and black, and a mixture of pale blond and black hair."),
            new GoTCharacter(0, "Tywin Lannister", SERVER_URL + "tywin.jpg", SERVER_URL + "tywin_full.jpg", false, LANNISTER, "Tywin Lannister is " +
                    "Lord of Casterly Rock, Shield of Lannisport and Warden of the West. The head of House Lannister, Tywin is one of the most powerful lords in Westeros" +
                    "."),
            new GoTCharacter(0, "Varys", SERVER_URL + "varys.jpg", SERVER_URL + "varys_full.jpg", true, LANNISTER, "Varys, called the Spider, is an " +
                    "enigmatic member of the small council and the master of whisperers, or spymaster, for the Iron Throne of the Seven Kingdoms.")
    };
}
