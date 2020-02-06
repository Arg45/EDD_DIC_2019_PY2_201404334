package Proyecto2;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CargarJson {
   
    public void cargaUsuarios(String p) {
        //String prueba = " [{  \"Nombre\": \"Zachary\",  \"Apellido\": \"Luckham\",  \"Carnet\": \"53-837-7039\",  \"Password\": \"POIcWD\" }, {  \"Nombre\": \"Colette\",  \"Apellido\": \"Harly\",  \"Carnet\": \"57-815-1498\",  \"Password\": \"wmYOZ7\" }, {  \"Nombre\": \"Alameda\",  \"Apellido\": \"Penketh\",  \"Carnet\": \"93-132-5485\",  \"Password\": \"gc63mcsNJ\" }, {  \"Nombre\": \"Lyndel\",  \"Apellido\": \"Records\",  \"Carnet\": \"96-153-1768\",  \"Password\": \"kuIgEwE\" }, {  \"Nombre\": \"Lorianne\",  \"Apellido\": \"Pinney\",  \"Carnet\": \"47-342-3160\",  \"Password\": \"FTUim7\" }, {  \"Nombre\": \"Jewell\",  \"Apellido\": \"Derks\",  \"Carnet\": \"39-260-6317\",  \"Password\": \"jYZcBV\" }, {  \"Nombre\": \"Kora\",  \"Apellido\": \"Schenfisch\",  \"Carnet\": \"32-132-3021\",  \"Password\": \"QmhNsV1y6\" }, {  \"Nombre\": \"Gasper\",  \"Apellido\": \"Barti\",  \"Carnet\": \"77-069-7285\",  \"Password\": \"eVLEIM\" }, {  \"Nombre\": \"Babbie\",  \"Apellido\": \"Ledrun\",  \"Carnet\": \"62-467-7370\",  \"Password\": \"uqDYlRa1dC\" }, {  \"Nombre\": \"Bette\",  \"Apellido\": \"Maurice\",  \"Carnet\": \"83-547-7694\",  \"Password\": \"rNHdPwZMQQ4n\" }, {  \"Nombre\": \"Nariko\",  \"Apellido\": \"Spykins\",  \"Carnet\": \"05-079-3421\",  \"Password\": \"q5BqNq1sJlVY\" }, {\n" + "  \"Nombre\": \"Alexandre\",  \"Apellido\": \"Lamlin\",  \"Carnet\": \"39-423-6440\",  \"Password\": \"HZ70dAXg\" }, {  \"Nombre\": \"Sukey\",  \"Apellido\": \"Lammenga\",  \"Carnet\": \"67-093-7276\",  \"Password\": \"xsVha9Wn3\" }, {  \"Nombre\": \"Karel\",  \"Apellido\": \"Barwise\",  \"Carnet\": \"02-958-8327\",  \"Password\": \"Kz9qPh6F\" }, {  \"Nombre\": \"Simonette\",  \"Apellido\": \"Knutton\",  \"Carnet\": \"05-045-9597\",  \"Password\": \"ip37l4gE\" }, {  \"Nombre\": \"Lucine\",  \"Apellido\": \"Paulet\",  \"Carnet\": \"94-160-6366\",  \"Password\": \"B4oiq454N2\" }, {  \"Nombre\": \"Axe\",  \"Apellido\": \"Nelhams\",  \"Carnet\": \"52-535-3936\",  \"Password\": \"FV4H8sSlQ\" }, {  \"Nombre\": \"Bertrando\",  \"Apellido\": \"Janny\",  \"Carnet\": \"20-367-7073\",  \"Password\": \"ZFQE8MZ6DUc\" }, {  \"Nombre\": \"Suzie\",  \"Apellido\": \"Fawke\",  \"Carnet\": \"47-237-4927\",  \"Password\": \"j8K1SNGCqMlx\" }, {  \"Nombre\": \"Essie\",  \"Apellido\": \"Danilovitch\",  \"Carnet\": \"31-405-6742\",  \"Password\": \"ZRd34djHE\" }] ";
        JsonParser parser = new JsonParser();        
        JsonArray gsonArr = parser.parse(p).getAsJsonArray();        
        for(JsonElement obj : gsonArr){
            JsonObject gsonObj = obj.getAsJsonObject();            
            String nombre = gsonObj.get("Nombre").getAsString();
            //System.out.println("Nombre: "+nombre);
            String apellido = gsonObj.get("Apellido").getAsString();
            //System.out.println("Apellido: "+apellido);
            String carnet = gsonObj.get("Carnet").getAsString();
            //System.out.println("Carnet: "+carnet);
            String pass = gsonObj.get("Password").getAsString();
            //System.out.println("Password: "+pass+"\n");
        }
    }
    public void cargaArreglos(String p){
        //String p = "{  \"Array\":[    {      \"num\":20    }    ,    {      \"num\":100    }    ,    {      \"num\":50    }    ,    {      \"num\":30    }    ,    {      \"num\":100    }    ,    {      \"num\":200    }    ,    {      \"num\":300    }    ,    {      \"num\":80    }  ] }";
        JsonParser parser = new JsonParser();
        JsonObject obj1 = parser.parse(p).getAsJsonObject();
        
        JsonArray array = obj1.get("Array").getAsJsonArray();
        for (JsonElement obj : array){
            JsonObject gsonObj = obj.getAsJsonObject();            
            String numero = gsonObj.get("num").getAsString();
            //System.out.println("valor: "+numero);
        }    
    }
    public void cargaArboles(String p){
    //String p ="{  \"Input\":[    {      \"num\":45    }    ,    {      \"num\":6    }    ,    {      \"num\":8    }    ,    {      \"num\":1    }    ,    {      \"num\":100    }    ,    {      \"num\":200    }    ,    {      \"num\":300    }    ,    {      \"num\":89    }  ] }";
    JsonParser parser = new JsonParser();
        JsonObject obj1 = parser.parse(p).getAsJsonObject();
        
        JsonArray array = obj1.get("Input").getAsJsonArray();
        for (JsonElement obj : array){
            JsonObject gsonObj = obj.getAsJsonObject();            
            String numero = gsonObj.get("num").getAsString();
            //System.out.println("valor: "+numero);
        }
    }
    public void cargaGrafo(String p){
    //String p ="{  \"Graph\":[    {      \"Node\":\"a\",      \"Adjacency\":[        {          \"Node\":\"g\"        }        ,        {          \"Node\":\"f\"        }      ]    }    ,    {      \"Node\":\"g\",      \"Adjacency\":[        {          \"Node\":\"b\"        }        ,        {          \"Node\":\"c\"        }        ,        {          \"Node\":\"f\"        }        ,        {          \"Node\":\"a\"        }      ]    }    ,    {      \"Node\":\"f\",      \"Adjacency\":[        {          \"Node\":\"a\"        }        ,        {          \"Node\":\"g\"        }        ,        {          \"Node\":\"b\"        }        ,        {          \"Node\":\"c\"        }      ]    }\n" + "    ,    {      \"Node\":\"b\",      \"Adjacency\":[        {          \"Node\":\"g\"        }        ,        {          \"Node\":\"f\"        }        ,        {          \"Node\":\"c\"        }        ,        {          \"Node\":\"e\"        }      ]    }    ,    {      \"Node\":\"c\",      \"Adjacency\":[        {          \"Node\":\"f\"        }        ,        {          \"Node\":\"g\"        }        ,        {          \"Node\":\"b\"        }        ,        {          \"Node\":\"e\"        }      ]    }    ,    {      \"Node\":\"e\",      \"Adjacency\":[        {          \"Node\":\"b\"        }        ,        {          \"Node\":\"c\"        }      ]    }  ] }";
    JsonParser parser = new JsonParser();
        JsonObject obj1 = parser.parse(p).getAsJsonObject();
        
        JsonArray array = obj1.get("Graph").getAsJsonArray();
        for (JsonElement obj : array){
            JsonObject gsonObj = obj.getAsJsonObject();            
            String nodo = gsonObj.get("Node").getAsString();
            //System.out.println("nodo externo: "+nodo);
            JsonArray gsonArr = gsonObj.get("Adjacency").getAsJsonArray();
            for(JsonElement obj2 : gsonArr){
                JsonObject gsonObj1 = obj2.getAsJsonObject();            
            String nodo1 = gsonObj1.get("Node").getAsString();
            //System.out.println("nodo interno: "+nodo1);
            }            
        }    
    }
}