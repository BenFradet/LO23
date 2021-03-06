/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudoku.comm.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Comment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Comment\",\"namespace\":\"com.sudoku.comm.generated\",\"fields\":[{\"name\":\"author\",\"type\":{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"pseudo\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"salt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birthDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"profilePicturePath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"updateDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipAddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"comment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"grade\",\"type\":\"double\"},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.sudoku.comm.generated.User author;
  @Deprecated public java.lang.String comment;
  @Deprecated public double grade;
  @Deprecated public java.lang.String createDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Comment() {}

  /**
   * All-args constructor.
   */
  public Comment(com.sudoku.comm.generated.User author, java.lang.String comment, java.lang.Double grade, java.lang.String createDate) {
    this.author = author;
    this.comment = comment;
    this.grade = grade;
    this.createDate = createDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return author;
    case 1: return comment;
    case 2: return grade;
    case 3: return createDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: author = (com.sudoku.comm.generated.User)value$; break;
    case 1: comment = (java.lang.String)value$; break;
    case 2: grade = (java.lang.Double)value$; break;
    case 3: createDate = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'author' field.
   */
  public com.sudoku.comm.generated.User getAuthor() {
    return author;
  }

  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(com.sudoku.comm.generated.User value) {
    this.author = value;
  }

  /**
   * Gets the value of the 'comment' field.
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(java.lang.String value) {
    this.comment = value;
  }

  /**
   * Gets the value of the 'grade' field.
   */
  public java.lang.Double getGrade() {
    return grade;
  }

  /**
   * Sets the value of the 'grade' field.
   * @param value the value to set.
   */
  public void setGrade(java.lang.Double value) {
    this.grade = value;
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

  /** Creates a new Comment RecordBuilder */
  public static com.sudoku.comm.generated.Comment.Builder newBuilder() {
    return new com.sudoku.comm.generated.Comment.Builder();
  }
  
  /** Creates a new Comment RecordBuilder by copying an existing Builder */
  public static com.sudoku.comm.generated.Comment.Builder newBuilder(com.sudoku.comm.generated.Comment.Builder other) {
    return new com.sudoku.comm.generated.Comment.Builder(other);
  }
  
  /** Creates a new Comment RecordBuilder by copying an existing Comment instance */
  public static com.sudoku.comm.generated.Comment.Builder newBuilder(com.sudoku.comm.generated.Comment other) {
    return new com.sudoku.comm.generated.Comment.Builder(other);
  }
  
  /**
   * RecordBuilder for Comment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Comment>
    implements org.apache.avro.data.RecordBuilder<Comment> {

    private com.sudoku.comm.generated.User author;
    private java.lang.String comment;
    private double grade;
    private java.lang.String createDate;

    /** Creates a new Builder */
    private Builder() {
      super(com.sudoku.comm.generated.Comment.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.sudoku.comm.generated.Comment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.author)) {
        this.author = data().deepCopy(fields()[0].schema(), other.author);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comment)) {
        this.comment = data().deepCopy(fields()[1].schema(), other.comment);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.grade)) {
        this.grade = data().deepCopy(fields()[2].schema(), other.grade);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.createDate)) {
        this.createDate = data().deepCopy(fields()[3].schema(), other.createDate);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Comment instance */
    private Builder(com.sudoku.comm.generated.Comment other) {
            super(com.sudoku.comm.generated.Comment.SCHEMA$);
      if (isValidValue(fields()[0], other.author)) {
        this.author = data().deepCopy(fields()[0].schema(), other.author);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comment)) {
        this.comment = data().deepCopy(fields()[1].schema(), other.comment);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.grade)) {
        this.grade = data().deepCopy(fields()[2].schema(), other.grade);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.createDate)) {
        this.createDate = data().deepCopy(fields()[3].schema(), other.createDate);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'author' field */
    public com.sudoku.comm.generated.User getAuthor() {
      return author;
    }
    
    /** Sets the value of the 'author' field */
    public com.sudoku.comm.generated.Comment.Builder setAuthor(com.sudoku.comm.generated.User value) {
      validate(fields()[0], value);
      this.author = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'author' field has been set */
    public boolean hasAuthor() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'author' field */
    public com.sudoku.comm.generated.Comment.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'comment' field */
    public java.lang.String getComment() {
      return comment;
    }
    
    /** Sets the value of the 'comment' field */
    public com.sudoku.comm.generated.Comment.Builder setComment(java.lang.String value) {
      validate(fields()[1], value);
      this.comment = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'comment' field has been set */
    public boolean hasComment() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'comment' field */
    public com.sudoku.comm.generated.Comment.Builder clearComment() {
      comment = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'grade' field */
    public java.lang.Double getGrade() {
      return grade;
    }
    
    /** Sets the value of the 'grade' field */
    public com.sudoku.comm.generated.Comment.Builder setGrade(double value) {
      validate(fields()[2], value);
      this.grade = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'grade' field has been set */
    public boolean hasGrade() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'grade' field */
    public com.sudoku.comm.generated.Comment.Builder clearGrade() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'createDate' field */
    public java.lang.String getCreateDate() {
      return createDate;
    }
    
    /** Sets the value of the 'createDate' field */
    public com.sudoku.comm.generated.Comment.Builder setCreateDate(java.lang.String value) {
      validate(fields()[3], value);
      this.createDate = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'createDate' field has been set */
    public boolean hasCreateDate() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'createDate' field */
    public com.sudoku.comm.generated.Comment.Builder clearCreateDate() {
      createDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Comment build() {
      try {
        Comment record = new Comment();
        record.author = fieldSetFlags()[0] ? this.author : (com.sudoku.comm.generated.User) defaultValue(fields()[0]);
        record.comment = fieldSetFlags()[1] ? this.comment : (java.lang.String) defaultValue(fields()[1]);
        record.grade = fieldSetFlags()[2] ? this.grade : (java.lang.Double) defaultValue(fields()[2]);
        record.createDate = fieldSetFlags()[3] ? this.createDate : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
