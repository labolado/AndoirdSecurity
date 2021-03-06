package org.codehaus.jackson.map.ext;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class JodaDeserializers$LocalDateTimeDeserializer
  extends JodaDeserializers.JodaDeserializer<LocalDateTime>
{
  public JodaDeserializers$LocalDateTimeDeserializer()
  {
    super(LocalDateTime.class);
  }
  
  public LocalDateTime deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
    throws IOException, JsonProcessingException
  {
    if (paramJsonParser.isExpectedStartArrayToken())
    {
      paramJsonParser.nextToken();
      int j = paramJsonParser.getIntValue();
      paramJsonParser.nextToken();
      int k = paramJsonParser.getIntValue();
      paramJsonParser.nextToken();
      int m = paramJsonParser.getIntValue();
      paramJsonParser.nextToken();
      int n = paramJsonParser.getIntValue();
      paramJsonParser.nextToken();
      int i1 = paramJsonParser.getIntValue();
      paramJsonParser.nextToken();
      int i2 = paramJsonParser.getIntValue();
      int i = 0;
      if (paramJsonParser.nextToken() != JsonToken.END_ARRAY)
      {
        i = paramJsonParser.getIntValue();
        paramJsonParser.nextToken();
      }
      if (paramJsonParser.getCurrentToken() != JsonToken.END_ARRAY) {
        throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.END_ARRAY, "after LocalDateTime ints");
      }
      return new LocalDateTime(j, k, m, n, i1, i2, i);
    }
    switch (JodaDeserializers.1.$SwitchMap$org$codehaus$jackson$JsonToken[paramJsonParser.getCurrentToken().ordinal()])
    {
    default: 
      throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.START_ARRAY, "expected JSON Array or Number");
    case 1: 
      return new LocalDateTime(paramJsonParser.getLongValue());
    }
    paramJsonParser = parseLocal(paramJsonParser);
    if (paramJsonParser == null) {
      return null;
    }
    return paramJsonParser.toLocalDateTime();
  }
}

/* Location:
 * Qualified Name:     org.codehaus.jackson.map.ext.JodaDeserializers.LocalDateTimeDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */