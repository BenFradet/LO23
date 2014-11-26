/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudoku.comm.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Comment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Comment\",\"namespace\":\"com.sudoku.comm.generated\",\"fields\":[{\"name\":\"author\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"comment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"grade\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String author;
  @Deprecated public java.lang.String comment;
  @Deprecated public int grade;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Comment() {}

  /**
   * All-args constructor.
   */
  public Comment(java.lang.String author, java.lang.String comment, java.lang.Integer grade) {
    this.author = author;
    this.comment = comment;
    this.grade = grade;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return author;
    case 1: return comment;
    case 2: return grade;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: author = (java.lang.String)value$; break;
    case 1: comment = (java.lang.String)value$; break;
    case 2: grade = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'author' field.
   */
  public java.lang.String getAuthor() {
    return author;
  }

  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(java.lang.String value) {
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
  public java.lang.Integer getGrade() {
    return grade;
  }

  /**
   * Sets the value of the 'grade' field.
   * @param value the value to set.
   */
  public void setGrade(java.lang.Integer value) {
    this.grade = value;
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

    private java.lang.String author;
    private java.lang.String comment;
    private int grade;

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
    }

    /** Gets the value of the 'author' field */
    public java.lang.String getAuthor() {
      return author;
    }
    
    /** Sets the value of the 'author' field */
    public com.sudoku.comm.generated.Comment.Builder setAuthor(java.lang.String value) {
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
    public java.lang.Integer getGrade() {
      return grade;
    }
    
    /** Sets the value of the 'grade' field */
    public com.sudoku.comm.generated.Comment.Builder setGrade(int value) {
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

    @Override
    public Comment build() {
      try {
        Comment record = new Comment();
        record.author = fieldSetFlags()[0] ? this.author : (java.lang.String) defaultValue(fields()[0]);
        record.comment = fieldSetFlags()[1] ? this.comment : (java.lang.String) defaultValue(fields()[1]);
        record.grade = fieldSetFlags()[2] ? this.grade : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
