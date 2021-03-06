/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudoku.comm.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.sudoku.comm.generated\",\"fields\":[{\"name\":\"pseudo\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"salt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birthDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"profilePicturePath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"updateDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipAddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String pseudo;
  @Deprecated public java.lang.String salt;
  @Deprecated public java.lang.String birthDate;
  @Deprecated public java.lang.String profilePicturePath;
  @Deprecated public java.lang.String createDate;
  @Deprecated public java.lang.String updateDate;
  @Deprecated public java.lang.String ipAddress;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public User() {}

  /**
   * All-args constructor.
   */
  public User(java.lang.String pseudo, java.lang.String salt, java.lang.String birthDate, java.lang.String profilePicturePath, java.lang.String createDate, java.lang.String updateDate, java.lang.String ipAddress) {
    this.pseudo = pseudo;
    this.salt = salt;
    this.birthDate = birthDate;
    this.profilePicturePath = profilePicturePath;
    this.createDate = createDate;
    this.updateDate = updateDate;
    this.ipAddress = ipAddress;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pseudo;
    case 1: return salt;
    case 2: return birthDate;
    case 3: return profilePicturePath;
    case 4: return createDate;
    case 5: return updateDate;
    case 6: return ipAddress;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pseudo = (java.lang.String)value$; break;
    case 1: salt = (java.lang.String)value$; break;
    case 2: birthDate = (java.lang.String)value$; break;
    case 3: profilePicturePath = (java.lang.String)value$; break;
    case 4: createDate = (java.lang.String)value$; break;
    case 5: updateDate = (java.lang.String)value$; break;
    case 6: ipAddress = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pseudo' field.
   */
  public java.lang.String getPseudo() {
    return pseudo;
  }

  /**
   * Sets the value of the 'pseudo' field.
   * @param value the value to set.
   */
  public void setPseudo(java.lang.String value) {
    this.pseudo = value;
  }

  /**
   * Gets the value of the 'salt' field.
   */
  public java.lang.String getSalt() {
    return salt;
  }

  /**
   * Sets the value of the 'salt' field.
   * @param value the value to set.
   */
  public void setSalt(java.lang.String value) {
    this.salt = value;
  }

  /**
   * Gets the value of the 'birthDate' field.
   */
  public java.lang.String getBirthDate() {
    return birthDate;
  }

  /**
   * Sets the value of the 'birthDate' field.
   * @param value the value to set.
   */
  public void setBirthDate(java.lang.String value) {
    this.birthDate = value;
  }

  /**
   * Gets the value of the 'profilePicturePath' field.
   */
  public java.lang.String getProfilePicturePath() {
    return profilePicturePath;
  }

  /**
   * Sets the value of the 'profilePicturePath' field.
   * @param value the value to set.
   */
  public void setProfilePicturePath(java.lang.String value) {
    this.profilePicturePath = value;
  }

  /**
   * Gets the value of the 'createDate' field.
   */
  public java.lang.String getCreateDate() {
    return createDate;
  }

  /**
   * Sets the value of the 'createDate' field.
   * @param value the value to set.
   */
  public void setCreateDate(java.lang.String value) {
    this.createDate = value;
  }

  /**
   * Gets the value of the 'updateDate' field.
   */
  public java.lang.String getUpdateDate() {
    return updateDate;
  }

  /**
   * Sets the value of the 'updateDate' field.
   * @param value the value to set.
   */
  public void setUpdateDate(java.lang.String value) {
    this.updateDate = value;
  }

  /**
   * Gets the value of the 'ipAddress' field.
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the value of the 'ipAddress' field.
   * @param value the value to set.
   */
  public void setIpAddress(java.lang.String value) {
    this.ipAddress = value;
  }

  /** Creates a new User RecordBuilder */
  public static com.sudoku.comm.generated.User.Builder newBuilder() {
    return new com.sudoku.comm.generated.User.Builder();
  }
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static com.sudoku.comm.generated.User.Builder newBuilder(com.sudoku.comm.generated.User.Builder other) {
    return new com.sudoku.comm.generated.User.Builder(other);
  }
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static com.sudoku.comm.generated.User.Builder newBuilder(com.sudoku.comm.generated.User other) {
    return new com.sudoku.comm.generated.User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.String pseudo;
    private java.lang.String salt;
    private java.lang.String birthDate;
    private java.lang.String profilePicturePath;
    private java.lang.String createDate;
    private java.lang.String updateDate;
    private java.lang.String ipAddress;

    /** Creates a new Builder */
    private Builder() {
      super(com.sudoku.comm.generated.User.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.sudoku.comm.generated.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.pseudo)) {
        this.pseudo = data().deepCopy(fields()[0].schema(), other.pseudo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.salt)) {
        this.salt = data().deepCopy(fields()[1].schema(), other.salt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[2].schema(), other.birthDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profilePicturePath)) {
        this.profilePicturePath = data().deepCopy(fields()[3].schema(), other.profilePicturePath);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.updateDate)) {
        this.updateDate = data().deepCopy(fields()[5].schema(), other.updateDate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[6].schema(), other.ipAddress);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(com.sudoku.comm.generated.User other) {
            super(com.sudoku.comm.generated.User.SCHEMA$);
      if (isValidValue(fields()[0], other.pseudo)) {
        this.pseudo = data().deepCopy(fields()[0].schema(), other.pseudo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.salt)) {
        this.salt = data().deepCopy(fields()[1].schema(), other.salt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[2].schema(), other.birthDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profilePicturePath)) {
        this.profilePicturePath = data().deepCopy(fields()[3].schema(), other.profilePicturePath);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.updateDate)) {
        this.updateDate = data().deepCopy(fields()[5].schema(), other.updateDate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[6].schema(), other.ipAddress);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'pseudo' field */
    public java.lang.String getPseudo() {
      return pseudo;
    }
    
    /** Sets the value of the 'pseudo' field */
    public com.sudoku.comm.generated.User.Builder setPseudo(java.lang.String value) {
      validate(fields()[0], value);
      this.pseudo = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'pseudo' field has been set */
    public boolean hasPseudo() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'pseudo' field */
    public com.sudoku.comm.generated.User.Builder clearPseudo() {
      pseudo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'salt' field */
    public java.lang.String getSalt() {
      return salt;
    }
    
    /** Sets the value of the 'salt' field */
    public com.sudoku.comm.generated.User.Builder setSalt(java.lang.String value) {
      validate(fields()[1], value);
      this.salt = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'salt' field has been set */
    public boolean hasSalt() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'salt' field */
    public com.sudoku.comm.generated.User.Builder clearSalt() {
      salt = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'birthDate' field */
    public java.lang.String getBirthDate() {
      return birthDate;
    }
    
    /** Sets the value of the 'birthDate' field */
    public com.sudoku.comm.generated.User.Builder setBirthDate(java.lang.String value) {
      validate(fields()[2], value);
      this.birthDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'birthDate' field has been set */
    public boolean hasBirthDate() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'birthDate' field */
    public com.sudoku.comm.generated.User.Builder clearBirthDate() {
      birthDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'profilePicturePath' field */
    public java.lang.String getProfilePicturePath() {
      return profilePicturePath;
    }
    
    /** Sets the value of the 'profilePicturePath' field */
    public com.sudoku.comm.generated.User.Builder setProfilePicturePath(java.lang.String value) {
      validate(fields()[3], value);
      this.profilePicturePath = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'profilePicturePath' field has been set */
    public boolean hasProfilePicturePath() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'profilePicturePath' field */
    public com.sudoku.comm.generated.User.Builder clearProfilePicturePath() {
      profilePicturePath = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'createDate' field */
    public java.lang.String getCreateDate() {
      return createDate;
    }
    
    /** Sets the value of the 'createDate' field */
    public com.sudoku.comm.generated.User.Builder setCreateDate(java.lang.String value) {
      validate(fields()[4], value);
      this.createDate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'createDate' field has been set */
    public boolean hasCreateDate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'createDate' field */
    public com.sudoku.comm.generated.User.Builder clearCreateDate() {
      createDate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'updateDate' field */
    public java.lang.String getUpdateDate() {
      return updateDate;
    }
    
    /** Sets the value of the 'updateDate' field */
    public com.sudoku.comm.generated.User.Builder setUpdateDate(java.lang.String value) {
      validate(fields()[5], value);
      this.updateDate = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'updateDate' field has been set */
    public boolean hasUpdateDate() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'updateDate' field */
    public com.sudoku.comm.generated.User.Builder clearUpdateDate() {
      updateDate = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'ipAddress' field */
    public java.lang.String getIpAddress() {
      return ipAddress;
    }
    
    /** Sets the value of the 'ipAddress' field */
    public com.sudoku.comm.generated.User.Builder setIpAddress(java.lang.String value) {
      validate(fields()[6], value);
      this.ipAddress = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'ipAddress' field has been set */
    public boolean hasIpAddress() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'ipAddress' field */
    public com.sudoku.comm.generated.User.Builder clearIpAddress() {
      ipAddress = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.pseudo = fieldSetFlags()[0] ? this.pseudo : (java.lang.String) defaultValue(fields()[0]);
        record.salt = fieldSetFlags()[1] ? this.salt : (java.lang.String) defaultValue(fields()[1]);
        record.birthDate = fieldSetFlags()[2] ? this.birthDate : (java.lang.String) defaultValue(fields()[2]);
        record.profilePicturePath = fieldSetFlags()[3] ? this.profilePicturePath : (java.lang.String) defaultValue(fields()[3]);
        record.createDate = fieldSetFlags()[4] ? this.createDate : (java.lang.String) defaultValue(fields()[4]);
        record.updateDate = fieldSetFlags()[5] ? this.updateDate : (java.lang.String) defaultValue(fields()[5]);
        record.ipAddress = fieldSetFlags()[6] ? this.ipAddress : (java.lang.String) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
