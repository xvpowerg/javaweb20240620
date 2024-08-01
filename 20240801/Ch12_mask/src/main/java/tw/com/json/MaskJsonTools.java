package tw.com.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beans.Mask;

public class MaskJsonTools {
	
	public static void maskJsonToObj(String maskJson,Consumer<List<Mask>>  callBack) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objMapper = new ObjectMapper();
		Map<String,Object> maskJsonMap = objMapper.readValue(maskJson, Map.class);
		List<Map<String,Object>> features =  (List) maskJsonMap.get("features");
		List<Mask> listMask = new ArrayList();
		for (Map<String,Object> dataMap : features) {
			Map<String,Object> pMap = (Map) dataMap.get("properties");
			Mask mask = new Mask();
			mask.setId(pMap.get("id").toString());
			mask.setName(pMap.get("name").toString());
			mask.setMaskAdult(pMap.get("mask_adult").toString());
			mask.setMaskChild(pMap.get("mask_child").toString());
			listMask.add(mask);
		}
		//System.out.println(listMask);
		callBack.accept(listMask);
		
	}
}
