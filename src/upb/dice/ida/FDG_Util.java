package upb.dice.ida;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class FDG_Util {
	public static final GsonBuilder builder = new GsonBuilder();
	public static final Gson gson = builder.create();
	public static final int MAX_STR = 10;
	/**
	 * Method to convert a list of triples into formatted json data for FDG Visualization
	 * @param triples - list of triples
	 * @return jsonobject of data
	 */
	public static JsonObject getFDGData(List<FDG_Triple> triples) {
		JsonObject resData = new JsonObject();
		JsonArray nodeArr = new JsonArray();
		JsonArray edgeArr = new JsonArray();
		resData.add("nodes", nodeArr);
		resData.add("links", edgeArr);
		Set<FDG_Node> nodeSet = new HashSet<>();
		FDG_Node srcNd, trgtNd;
		JsonObject edgeJson;
		boolean isNew;
		for (FDG_Triple entry : triples) {
			srcNd = entry.getSourceNode();
			trgtNd = entry.getTargetNode();
			// Add nodes to the set
			isNew = nodeSet.add(srcNd);
			if (isNew)
				nodeArr.add(gson.toJson(srcNd));
			isNew = nodeSet.add(trgtNd);
			if (isNew)
				nodeArr.add(gson.toJson(trgtNd));
			// Add the edge
			edgeJson = new JsonObject();
			edgeArr.add(edgeJson);
			// add the properties
			edgeJson.addProperty("id", entry.getId());
			edgeJson.addProperty("source", entry.getSourceNode().getId());
			edgeJson.addProperty("target", entry.getTargetNode().getId());
			//TODO: Normalization needed between 1-10 (Use standard deviation to decide the strength of the edge)
			edgeJson.addProperty("str_val", entry.getStr_val());
			if (entry.getLabel() != null)
				edgeJson.addProperty("label", entry.getLabel());
		}
		return resData;
	}

}
