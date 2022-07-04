package group.cubetech.elasticsearch.expression;

import com.fasterxml.jackson.databind.node.ObjectNode;
import group.cubetech.elasticsearch.exception.EasyElasticSearchParseException;

import java.io.IOException;

public interface ValueHandler {

	void parse(ObjectNode json) throws EasyElasticSearchParseException, IOException;

}
