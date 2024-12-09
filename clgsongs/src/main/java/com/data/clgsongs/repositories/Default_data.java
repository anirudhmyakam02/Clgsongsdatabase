package com.data.clgsongs.repositories;

import com.data.clgsongs.modules.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Default_data implements CommandLineRunner {

    private final SongRepository songRepository;
    public Default_data(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Songs added");

//        adding telugu songs
        Song song;
        song = Song.builder()
                .title("చిట్టి చిలకమ్మా")
                .language("TELUGU")
                .lyrics("చిట్టి చిలకమ్మా\\nఅమ్మ కొట్టిందా\\nతోటకెల్లావా\\nపండు తెచ్చావా\\nగూట్లో పెట్టావా\\nగుటుక్కున మింగావా\\nగూట్లో పెట్టావా\\nగుటుక్కున మింగావా\\nగుటుక్కున మింగావా\\n\\nచిట్టి చిలకమ్మా\\nఅమ్మ కొట్టిందా\\nతోటకెల్లావా\\nపండు తెచ్చావా\\nగూట్లో పెట్టావా\\nగుటుక్కున మింగావా\\nగూట్లో పెట్టావా\\nగుటుక్కున మింగావా\\nగుటుక్కున మింగావా")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("ఉడుత ఉడుతా ఊచ్")
                .language("Telugu")
                .lyrics("ఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్\\nకొమ్మ మీద జాంపండు కోసుకొస్తావా,\\nమా పాపాయికిస్తావా..\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావోచ్\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్\\n\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్\\nకొమ్మ మీద జాంపండు కోసుకొస్తావా,\\nమా పాపాయికిస్తావా..\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావోచ్\\nఉడుత ఉడుతా ఊచ్\\nఎక్కడికెళ్శావ్ ఊచ్")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("ఏనుగమ్మ ఏనుగు")
                .language("TELUGU")
                .lyrics("ఏనుగమ్మ ఏనుగు,\\nఏ ఊరెళ్ళిందేనుగు?\\nఏనుగమ్మ ఏనుగు,\\nమా ఊరొచ్చిందేనుగు\\nఏనుగు ఏనుగు నల్లన,\\nఏనుగు కొమ్ములు తెల్లన\\nఏనుగు ఏనుగు నల్లన,\\nఏనుగు కొమ్ములు తెల్లన\\nఏనుగు మీద రాముడు,\\nఎంతో చక్కని దేవుడు\\nఏనుగు మీద రాముడు,\\nఎంతో చక్కని దేవుడు\\n\\nఏనుగమ్మ ఏనుగు,\\nఏ ఊరెళ్ళిందేనుగు?\\nఏనుగమ్మ ఏనుగు,\\nమా ఊరొచ్చిందేనుగు\\nఏనుగమ్మ ఏనుగు,\\nఏ ఊరెళ్ళిందేనుగు?\\nఏనుగమ్మ ఏనుగు,\\nమా ఊరొచ్చిందేనుగు\\nఏనుగు ఏనుగు నల్లన,\\nఏనుగు కొమ్ములు తెల్లన\\nఏనుగు ఏనుగు నల్లన,\\nఏనుగు కొమ్ములు తెల్లన\\nఏనుగు మీద రాముడు,\\nఎంతో చక్కని దేవుడు\\nఏనుగు మీద రాముడు,\\nఎంతో చక్కని దేవుడు")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("బుర్రు పిట్ట")
                .language("TELUGU")
                .lyrics("బుర్రు పిట్ట బుర్రు పిట్ట తుర్రుమన్నది...\\nపడమటింట కాపురం చేయనన్నది...\\nఅత్త తెచ్చిన కొత్త చీర కట్టనన్నది...\\nమామ తెచ్చిన మల్లె మొగ్గ ముడవనన్నది...\\nమొగుడి చేత మొట్టికాయ తింటానన్నది...\\nమొగుడి చేత మొట్టికాయ తింటానన్నది...\\n\\nబుర్రు పిట్ట బుర్రు పిట్ట తుర్రుమన్నది...\\nపడమటింట కాపురం చేయనన్నది...\\nఅత్త తెచ్చిన కొత్త చీర కట్టనన్నది...\\nమామ తెచ్చిన మల్లె మొగ్గ ముడవనన్నది...\\nమొగుడి చేత మొట్టికాయ తింటానన్నది...\\nమొగుడి చేత మొట్టికాయ తింటానన్నది...")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("बिल्ली मौसी")
                .language("HINDI")
                .lyrics("बिल्ली मौसी, बिल्ली मौसी, कहो कहाँ से आई हो\\nकितने चूहे मारे तुमने? कितने खा के आई हो?\\nकितने चूहे मारे तुमने? कितने खा के आई हो?\\n\\nक्या बताऊँ शीला बहन, आज नहीं कुछ पेट भरा\\nएक ही चूहा खाया मैंने, वो भी बिलकुल सड़ा हुआ\\nएक ही चूहा खाया मैंने, वो भी बिलकुल सड़ा हुआ")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("आसमान में निकले तारे")
                .language("HINDI")
                .lyrics("आसमान में निकले तारे\\nचंदा मामा कितने प्यारे\\nचंदा मामा, चंदा मामा\\n\\nसबके मन को बहलाते हैं\\nनई चाँदनी छिटकाते हैं\\nचंदा मामा, चंदा मामा\\n\\nदेखो इन की शान निराली\\nसूरत कितनी भोली-भाली\\nरोज़सवेरे छुप जाते हैं\\nजैसे हम से शरमाते हैं\\nचंदा मामा, चंदा मामा\\n\\nआओ,चंदा मामा आओ\\nअपने घर की बात सुनाओ\\nआओ,चंदा मामा आओ\\nअपने घर की बात सुनाओ\\nचंदा मामा, चंदा मामा")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("चुन्नू मुन्\u200Dनू ये दो भाई")
                .language("HINDI")
                .lyrics("चुन्नू मुन्\u200Dनू ये दो भाई\\n\\nरस गुल्ले पे हुई लड़ाई\\nचुन्नू बोला, \\\"मैं खाऊँगा\\\"\\nमुन्\u200Dनू बोला, \\\"मैं खाऊँगा\\\"\\n\\nहल्ला सुनकर आई\\nदोनों को एक चपत लगाई\\n\\nकभी ना लड़ना, कभी ना झगड़ना\\nआपस में तम मिलकर रहना\",\n")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("बंदर मामा")
                .language("HINDI")
                .lyrics("बंदर मामा पहन पजामा दावत खाने आए\\\\nबंदर मामा पहन पजामा दावत खाने आए\\\\nढीला कुर्ता, टोपी-जूता पहन बहुत इतराए\\\\nढीला कुर्ता, टोपी-जूता पहन बहुत इतराए\\\\n\\\\nरसगुल्ले पर जी ललचाया, मुँह में रखा कब से\\\\nरसगुल्ले पर जी ललचाया, मुँह में रखा कब से\\\\nनरम-नरम था, गरम-गरम था, जीभ जल गई लप से\\\\nनरम-नरम था, गरम-गरम था, जीभ जल गई लप से\\\\n\\\\nबंदर मामा रोते-रोते वापस घर को आए\\\\nबंदर मामा रोते-रोते वापस घर को आए\\\\nफेंकी टोपी, फेंका जूता, रोए और पछताए\\\\nफेंकी टोपी, फेंका जूता, रोए और पछताए")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("ஆனை ஆனை அழகர் ஆனை")
                .language("TAMIL")
                .lyrics("ஆனை ஆனை அழகர் ஆனை\\n\\nஅழகரும் சொக்கரும் ஏறும் ஆனை\\n\\nகட்டிக்கரும்பை முறிக்கும் ஆனை\\n\\nகாவேரி தண்ணீரை கலக்கும் ஆனை\\n\\nகுட்டி ஆனைக்குக் கொம்பு முளைச்சுதாம்\\n\\nபட்டணமெல்லாம் பறந்தோடிப் போச்சுதாம்!")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("அம்மா இங்கே வா! வா!")
                .language("TAMIL")
                .lyrics("அம்மா இங்கே வா! வா!\\nஆசை முத்தம் தா! தா!\\nஇலையில் சோறு போட்டு\\nஈயைத் தூர ஓட்டு\\nஉன்னைப் போன்ற நல்லார்,\\nஊரில் யாவர் உள்ளார்?\\nஎன்னால் உனக்குத் தொல்லை\\nஏதும் இங்கே இல்லை\\nஐயமின்றி சொல்லுவேன்\\nஒற்றுமை என்றும் பலமாம்\\nஓதும் செயலே நலமாம்\\nஔவை சொன்ன மொழியாம்\\nஅஃதே எனக்கு வழியாம்.")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("அணிலே அணிலே ஓடிவா")
                .language("TAMIL")
                .lyrics("அணிலே அணிலே ஓடிவா\\nஅழகு அணிலே ஓடிவா\\n\\nகொய்யாமரம் ஏறிவா\\nகுண்டுப்பழம் கொண்டு வா\\n\\nபாதிப்பழம் என்னிடம்\\nமீதிப்பழம் உன்னிடம்\\n\\nகூடிக்கூடி இருவரும்\\nகொறித்துக் கொறித்து தின்னலாம்")
                .build();
        songRepository.save(song);

        song = Song.builder()
                .title("தோசை அம்மா தோசை")
                .language("TAMIL")
                .lyrics("தோசை அம்மா தோசை\\nஅம்மா சுட்ட தோசை!\\nஅரிசி மாவும் உளுந்து மாவும்\\nகலந்து சுட்ட தோசை!\\nஅப்பாவுக்கு நாலு\\nஅம்மாவுக்கு மூன்று\\nஅண்ணணூக்கு இரண்டு\\nபாப்பாவுக்கு ஒன்று\\nதிங்க திங்க ஆசை\\nஇன்னும் கேட்டால் பூசை!")
                .build();
        songRepository.save(song);
    }
}