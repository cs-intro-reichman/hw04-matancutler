public class KeywordsDetector 
{
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

        public static boolean contains(String str1, String str2)
        {
            String NewStr1 = str1;
            String NewStr2 = str2;
            int counter = 0;
            if(NewStr2.length() > NewStr1.length() || NewStr1.length() == 0) return false;
            if(NewStr2.length() == 0) return true;
            for (int i = 0; i < NewStr1.length(); i ++)
            {
                if (str1.charAt(i) == NewStr2.charAt(0))
                {
                    for (int j = i; j < NewStr1.length(); j ++)
                    {
                        if(NewStr1.charAt(j) != NewStr2.charAt(counter))
                        {
                            counter = 0;
                            break;
                        }
                        if (counter == NewStr2.length()-1) 
                            return true;
                        counter ++;
                    }
                }
            }
            return false;
        }
    

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords)
    {
        // Replace this comment with your code
        String[] NewSentences = new String[sentences.length];
        String[] NewKeywords = new String [keywords.length];
        for(int k = 0; k < NewSentences.length; k ++) NewSentences[k] = "";
        for(int k = 0; k < NewKeywords.length; k ++) NewKeywords[k] = "";
        for(int i = 0; i < sentences.length; i ++) // converts all letters in sentences to lowercase
        {
            for(int j = 0; j < sentences[i].length(); j++)
            {
                if(sentences[i].charAt(j) <= 90 && sentences[i].charAt(j) >= 65)
                    NewSentences[i] += (char) (sentences[i].charAt(j) + 32);
                else
                    NewSentences[i] += sentences[i].charAt(j);
            } 
        }
        for(int i = 0; i < keywords.length; i ++) // converts all letters in keywords to lowercase
        {
            for(int j = 0; j < keywords[i].length(); j++)
            {
                if(keywords[i].charAt(j) <= 90 && keywords[i].charAt(j) >= 65)
                    NewKeywords[i] += (char) (keywords[i].charAt(j) + 32);
                else
                    NewKeywords[i] += keywords[i].charAt(j);
            } 
        }
        for(int i = 0; i < NewSentences.length; i ++) //runs on the sentences
        {
            for(int k = 0; k < keywords.length; k++) // runs on words
            {
                if(contains(NewSentences[i], NewKeywords[k]))
                {
                    System.out.println(sentences[i]);
                    break;
                } 
            }
        }        
    }
}
