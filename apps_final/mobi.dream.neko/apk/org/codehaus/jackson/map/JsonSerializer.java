package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;

public abstract class JsonSerializer<T>
{
  public Class<T> handledType()
  {
    return null;
  }
  
  public boolean isUnwrappingSerializer()
  {
    return false;
  }
  
  public abstract void serialize(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
    throws IOException, JsonProcessingException;
  
  public void serializeWithType(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
    throws IOException, JsonProcessingException
  {
    serialize(paramT, paramJsonGenerator, paramSerializerProvider);
  }
  
  public JsonSerializer<T> unwrappingSerializer()
  {
    return this;
  }
  
  public static abstract class None
    extends JsonSerializer<Object>
  {}
}

/* Location:
 * Qualified Name:     org.codehaus.jackson.map.JsonSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */