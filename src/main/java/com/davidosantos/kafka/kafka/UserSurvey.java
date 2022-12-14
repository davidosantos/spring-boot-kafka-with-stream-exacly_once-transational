/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.davidosantos.kafka.kafka;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UserSurvey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8807011199359022017L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserSurvey\",\"namespace\":\"com.davidosantos.kafka.kafka\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"user_id\",\"type\":\"long\"},{\"name\":\"best_actor_for_me\",\"type\":\"string\",\"default\":\"none\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\",\"default\":\"none\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserSurvey> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserSurvey> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserSurvey> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserSurvey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserSurvey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserSurvey to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserSurvey from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserSurvey instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserSurvey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long id;
  private long user_id;
  private java.lang.CharSequence best_actor_for_me;
  private java.lang.CharSequence name;
  private java.lang.CharSequence email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserSurvey() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param user_id The new value for user_id
   * @param best_actor_for_me The new value for best_actor_for_me
   * @param name The new value for name
   * @param email The new value for email
   */
  public UserSurvey(java.lang.Long id, java.lang.Long user_id, java.lang.CharSequence best_actor_for_me, java.lang.CharSequence name, java.lang.CharSequence email) {
    this.id = id;
    this.user_id = user_id;
    this.best_actor_for_me = best_actor_for_me;
    this.name = name;
    this.email = email;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return user_id;
    case 2: return best_actor_for_me;
    case 3: return name;
    case 4: return email;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: user_id = (java.lang.Long)value$; break;
    case 2: best_actor_for_me = (java.lang.CharSequence)value$; break;
    case 3: name = (java.lang.CharSequence)value$; break;
    case 4: email = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'user_id' field.
   * @return The value of the 'user_id' field.
   */
  public long getUserId() {
    return user_id;
  }


  /**
   * Sets the value of the 'user_id' field.
   * @param value the value to set.
   */
  public void setUserId(long value) {
    this.user_id = value;
  }

  /**
   * Gets the value of the 'best_actor_for_me' field.
   * @return The value of the 'best_actor_for_me' field.
   */
  public java.lang.CharSequence getBestActorForMe() {
    return best_actor_for_me;
  }


  /**
   * Sets the value of the 'best_actor_for_me' field.
   * @param value the value to set.
   */
  public void setBestActorForMe(java.lang.CharSequence value) {
    this.best_actor_for_me = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Creates a new UserSurvey RecordBuilder.
   * @return A new UserSurvey RecordBuilder
   */
  public static com.davidosantos.kafka.kafka.UserSurvey.Builder newBuilder() {
    return new com.davidosantos.kafka.kafka.UserSurvey.Builder();
  }

  /**
   * Creates a new UserSurvey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserSurvey RecordBuilder
   */
  public static com.davidosantos.kafka.kafka.UserSurvey.Builder newBuilder(com.davidosantos.kafka.kafka.UserSurvey.Builder other) {
    if (other == null) {
      return new com.davidosantos.kafka.kafka.UserSurvey.Builder();
    } else {
      return new com.davidosantos.kafka.kafka.UserSurvey.Builder(other);
    }
  }

  /**
   * Creates a new UserSurvey RecordBuilder by copying an existing UserSurvey instance.
   * @param other The existing instance to copy.
   * @return A new UserSurvey RecordBuilder
   */
  public static com.davidosantos.kafka.kafka.UserSurvey.Builder newBuilder(com.davidosantos.kafka.kafka.UserSurvey other) {
    if (other == null) {
      return new com.davidosantos.kafka.kafka.UserSurvey.Builder();
    } else {
      return new com.davidosantos.kafka.kafka.UserSurvey.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserSurvey instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserSurvey>
    implements org.apache.avro.data.RecordBuilder<UserSurvey> {

    private long id;
    private long user_id;
    private java.lang.CharSequence best_actor_for_me;
    private java.lang.CharSequence name;
    private java.lang.CharSequence email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.davidosantos.kafka.kafka.UserSurvey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.user_id)) {
        this.user_id = data().deepCopy(fields()[1].schema(), other.user_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.best_actor_for_me)) {
        this.best_actor_for_me = data().deepCopy(fields()[2].schema(), other.best_actor_for_me);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.email)) {
        this.email = data().deepCopy(fields()[4].schema(), other.email);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing UserSurvey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.davidosantos.kafka.kafka.UserSurvey other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.user_id)) {
        this.user_id = data().deepCopy(fields()[1].schema(), other.user_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.best_actor_for_me)) {
        this.best_actor_for_me = data().deepCopy(fields()[2].schema(), other.best_actor_for_me);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.email)) {
        this.email = data().deepCopy(fields()[4].schema(), other.email);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'user_id' field.
      * @return The value.
      */
    public long getUserId() {
      return user_id;
    }


    /**
      * Sets the value of the 'user_id' field.
      * @param value The value of 'user_id'.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder setUserId(long value) {
      validate(fields()[1], value);
      this.user_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'user_id' field has been set.
      * @return True if the 'user_id' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'user_id' field.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder clearUserId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'best_actor_for_me' field.
      * @return The value.
      */
    public java.lang.CharSequence getBestActorForMe() {
      return best_actor_for_me;
    }


    /**
      * Sets the value of the 'best_actor_for_me' field.
      * @param value The value of 'best_actor_for_me'.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder setBestActorForMe(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.best_actor_for_me = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'best_actor_for_me' field has been set.
      * @return True if the 'best_actor_for_me' field has been set, false otherwise.
      */
    public boolean hasBestActorForMe() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'best_actor_for_me' field.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder clearBestActorForMe() {
      best_actor_for_me = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder setName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.email = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.davidosantos.kafka.kafka.UserSurvey.Builder clearEmail() {
      email = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserSurvey build() {
      try {
        UserSurvey record = new UserSurvey();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.user_id = fieldSetFlags()[1] ? this.user_id : (java.lang.Long) defaultValue(fields()[1]);
        record.best_actor_for_me = fieldSetFlags()[2] ? this.best_actor_for_me : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.email = fieldSetFlags()[4] ? this.email : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserSurvey>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserSurvey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserSurvey>
    READER$ = (org.apache.avro.io.DatumReader<UserSurvey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeLong(this.user_id);

    out.writeString(this.best_actor_for_me);

    out.writeString(this.name);

    out.writeString(this.email);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.user_id = in.readLong();

      this.best_actor_for_me = in.readString(this.best_actor_for_me instanceof Utf8 ? (Utf8)this.best_actor_for_me : null);

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.user_id = in.readLong();
          break;

        case 2:
          this.best_actor_for_me = in.readString(this.best_actor_for_me instanceof Utf8 ? (Utf8)this.best_actor_for_me : null);
          break;

        case 3:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 4:
          this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










