import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map map = new HashMap<Character,Character>();
        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
        StringBuilder st= new StringBuilder();
        for(char c:dnaStrand.toCharArray()){
            st.append(map.get(c));
        }
        return st.toString();
    }

}
