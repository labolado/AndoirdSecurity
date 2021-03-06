package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.support.DatabaseResults;

public class ByteObjectType
  extends BaseDataType
{
  private static final ByteObjectType singleTon = new ByteObjectType();
  
  private ByteObjectType()
  {
    super(SqlType.BYTE, new Class[] { Byte.class });
  }
  
  protected ByteObjectType(SqlType paramSqlType, Class<?>[] paramArrayOfClass)
  {
    super(paramSqlType, paramArrayOfClass);
  }
  
  public static ByteObjectType getSingleton()
  {
    return singleTon;
  }
  
  public boolean isEscapedValue()
  {
    return false;
  }
  
  public Object parseDefaultString(FieldType paramFieldType, String paramString)
  {
    return Byte.valueOf(Byte.parseByte(paramString));
  }
  
  public Object resultToSqlArg(FieldType paramFieldType, DatabaseResults paramDatabaseResults, int paramInt)
  {
    return Byte.valueOf(paramDatabaseResults.getByte(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.j256.ormlite.field.types.ByteObjectType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */