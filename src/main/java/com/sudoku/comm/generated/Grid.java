/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudoku.comm.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Grid extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Grid\",\"namespace\":\"com.sudoku.comm.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"difficulty\",\"type\":\"int\"},{\"name\":\"published\",\"type\":\"boolean\"},{\"name\":\"commentsList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Comment\",\"fields\":[{\"name\":\"author\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"comment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"grade\",\"type\":\"int\"}]}}]},{\"name\":\"tagsList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"matrix\",\"type\":[\"null\",{\"type\":\"array\",\"items\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}]}]},{\"name\":\"createUser\",\"type\":{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"pseudo\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"salt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birthdate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"profilePicturePath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"updateDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipAddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"createDate\",\"type\":\"int\"},{\"name\":\"updateDate\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.String title;
  @Deprecated public java.lang.String description;
  @Deprecated public int difficulty;
  @Deprecated public boolean published;
  @Deprecated public java.util.List<com.sudoku.comm.generated.Comment> commentsList;
  @Deprecated public java.util.List<java.lang.String> tagsList;
  @Deprecated public java.util.List<java.util.List<java.lang.Integer>> matrix;
  @Deprecated public com.sudoku.comm.generated.User createUser;
  @Deprecated public int createDate;
  @Deprecated public int updateDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Grid() {}

  /**
   * All-args constructor.
   */
  public Grid(java.lang.Integer id, java.lang.String title, java.lang.String description, java.lang.Integer difficulty, java.lang.Boolean published, java.util.List<com.sudoku.comm.generated.Comment> commentsList, java.util.List<java.lang.String> tagsList, java.util.List<java.util.List<java.lang.Integer>> matrix, com.sudoku.comm.generated.User createUser, java.lang.Integer createDate, java.lang.Integer updateDate) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.difficulty = difficulty;
    this.published = published;
    this.commentsList = commentsList;
    this.tagsList = tagsList;
    this.matrix = matrix;
    this.createUser = createUser;
    this.createDate = createDate;
    this.updateDate = updateDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return title;
    case 2: return description;
    case 3: return difficulty;
    case 4: return published;
    case 5: return commentsList;
    case 6: return tagsList;
    case 7: return matrix;
    case 8: return createUser;
    case 9: return createDate;
    case 10: return updateDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: title = (java.lang.String)value$; break;
    case 2: description = (java.lang.String)value$; break;
    case 3: difficulty = (java.lang.Integer)value$; break;
    case 4: published = (java.lang.Boolean)value$; break;
    case 5: commentsList = (java.util.List<com.sudoku.comm.generated.Comment>)value$; break;
    case 6: tagsList = (java.util.List<java.lang.String>)value$; break;
    case 7: matrix = (java.util.List<java.util.List<java.lang.Integer>>)value$; break;
    case 8: createUser = (com.sudoku.comm.generated.User)value$; break;
    case 9: createDate = (java.lang.Integer)value$; break;
    case 10: updateDate = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'difficulty' field.
   */
  public java.lang.Integer getDifficulty() {
    return difficulty;
  }

  /**
   * Sets the value of the 'difficulty' field.
   * @param value the value to set.
   */
  public void setDifficulty(java.lang.Integer value) {
    this.difficulty = value;
  }

  /**
   * Gets the value of the 'published' field.
   */
  public java.lang.Boolean getPublished() {
    return published;
  }

  /**
   * Sets the value of the 'published' field.
   * @param value the value to set.
   */
  public void setPublished(java.lang.Boolean value) {
    this.published = value;
  }

  /**
   * Gets the value of the 'commentsList' field.
   */
  public java.util.List<com.sudoku.comm.generated.Comment> getCommentsList() {
    return commentsList;
  }

  /**
   * Sets the value of the 'commentsList' field.
   * @param value the value to set.
   */
  public void setCommentsList(java.util.List<com.sudoku.comm.generated.Comment> value) {
    this.commentsList = value;
  }

  /**
   * Gets the value of the 'tagsList' field.
   */
  public java.util.List<java.lang.String> getTagsList() {
    return tagsList;
  }

  /**
   * Sets the value of the 'tagsList' field.
   * @param value the value to set.
   */
  public void setTagsList(java.util.List<java.lang.String> value) {
    this.tagsList = value;
  }

  /**
   * Gets the value of the 'matrix' field.
   */
  public java.util.List<java.util.List<java.lang.Integer>> getMatrix() {
    return matrix;
  }

  /**
   * Sets the value of the 'matrix' field.
   * @param value the value to set.
   */
  public void setMatrix(java.util.List<java.util.List<java.lang.Integer>> value) {
    this.matrix = value;
  }

  /**
   * Gets the value of the 'createUser' field.
   */
  public com.sudoku.comm.generated.User getCreateUser() {
    return createUser;
  }

  /**
   * Sets the value of the 'createUser' field.
   * @param value the value to set.
   */
  public void setCreateUser(com.sudoku.comm.generated.User value) {
    this.createUser = value;
  }

  /**
   * Gets the value of the 'createDate' field.
   */
  public java.lang.Integer getCreateDate() {
    return createDate;
  }

  /**
   * Sets the value of the 'createDate' field.
   * @param value the value to set.
   */
  public void setCreateDate(java.lang.Integer value) {
    this.createDate = value;
  }

  /**
   * Gets the value of the 'updateDate' field.
   */
  public java.lang.Integer getUpdateDate() {
    return updateDate;
  }

  /**
   * Sets the value of the 'updateDate' field.
   * @param value the value to set.
   */
  public void setUpdateDate(java.lang.Integer value) {
    this.updateDate = value;
  }

  /** Creates a new Grid RecordBuilder */
  public static com.sudoku.comm.generated.Grid.Builder newBuilder() {
    return new com.sudoku.comm.generated.Grid.Builder();
  }
  
  /** Creates a new Grid RecordBuilder by copying an existing Builder */
  public static com.sudoku.comm.generated.Grid.Builder newBuilder(com.sudoku.comm.generated.Grid.Builder other) {
    return new com.sudoku.comm.generated.Grid.Builder(other);
  }
  
  /** Creates a new Grid RecordBuilder by copying an existing Grid instance */
  public static com.sudoku.comm.generated.Grid.Builder newBuilder(com.sudoku.comm.generated.Grid other) {
    return new com.sudoku.comm.generated.Grid.Builder(other);
  }
  
  /**
   * RecordBuilder for Grid instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Grid>
    implements org.apache.avro.data.RecordBuilder<Grid> {

    private int id;
    private java.lang.String title;
    private java.lang.String description;
    private int difficulty;
    private boolean published;
    private java.util.List<com.sudoku.comm.generated.Comment> commentsList;
    private java.util.List<java.lang.String> tagsList;
    private java.util.List<java.util.List<java.lang.Integer>> matrix;
    private com.sudoku.comm.generated.User createUser;
    private int createDate;
    private int updateDate;

    /** Creates a new Builder */
    private Builder() {
      super(com.sudoku.comm.generated.Grid.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.sudoku.comm.generated.Grid.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[3].schema(), other.difficulty);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.published)) {
        this.published = data().deepCopy(fields()[4].schema(), other.published);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.commentsList)) {
        this.commentsList = data().deepCopy(fields()[5].schema(), other.commentsList);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tagsList)) {
        this.tagsList = data().deepCopy(fields()[6].schema(), other.tagsList);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.matrix)) {
        this.matrix = data().deepCopy(fields()[7].schema(), other.matrix);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.createUser)) {
        this.createUser = data().deepCopy(fields()[8].schema(), other.createUser);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.createDate)) {
        this.createDate = data().deepCopy(fields()[9].schema(), other.createDate);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.updateDate)) {
        this.updateDate = data().deepCopy(fields()[10].schema(), other.updateDate);
        fieldSetFlags()[10] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Grid instance */
    private Builder(com.sudoku.comm.generated.Grid other) {
            super(com.sudoku.comm.generated.Grid.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[3].schema(), other.difficulty);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.published)) {
        this.published = data().deepCopy(fields()[4].schema(), other.published);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.commentsList)) {
        this.commentsList = data().deepCopy(fields()[5].schema(), other.commentsList);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tagsList)) {
        this.tagsList = data().deepCopy(fields()[6].schema(), other.tagsList);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.matrix)) {
        this.matrix = data().deepCopy(fields()[7].schema(), other.matrix);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.createUser)) {
        this.createUser = data().deepCopy(fields()[8].schema(), other.createUser);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.createDate)) {
        this.createDate = data().deepCopy(fields()[9].schema(), other.createDate);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.updateDate)) {
        this.updateDate = data().deepCopy(fields()[10].schema(), other.updateDate);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Integer getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.sudoku.comm.generated.Grid.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.sudoku.comm.generated.Grid.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.String getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public com.sudoku.comm.generated.Grid.Builder setTitle(java.lang.String value) {
      validate(fields()[1], value);
      this.title = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'title' field */
    public com.sudoku.comm.generated.Grid.Builder clearTitle() {
      title = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public com.sudoku.comm.generated.Grid.Builder setDescription(java.lang.String value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public com.sudoku.comm.generated.Grid.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'difficulty' field */
    public java.lang.Integer getDifficulty() {
      return difficulty;
    }
    
    /** Sets the value of the 'difficulty' field */
    public com.sudoku.comm.generated.Grid.Builder setDifficulty(int value) {
      validate(fields()[3], value);
      this.difficulty = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'difficulty' field has been set */
    public boolean hasDifficulty() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'difficulty' field */
    public com.sudoku.comm.generated.Grid.Builder clearDifficulty() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'published' field */
    public java.lang.Boolean getPublished() {
      return published;
    }
    
    /** Sets the value of the 'published' field */
    public com.sudoku.comm.generated.Grid.Builder setPublished(boolean value) {
      validate(fields()[4], value);
      this.published = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'published' field has been set */
    public boolean hasPublished() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'published' field */
    public com.sudoku.comm.generated.Grid.Builder clearPublished() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'commentsList' field */
    public java.util.List<com.sudoku.comm.generated.Comment> getCommentsList() {
      return commentsList;
    }
    
    /** Sets the value of the 'commentsList' field */
    public com.sudoku.comm.generated.Grid.Builder setCommentsList(java.util.List<com.sudoku.comm.generated.Comment> value) {
      validate(fields()[5], value);
      this.commentsList = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'commentsList' field has been set */
    public boolean hasCommentsList() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'commentsList' field */
    public com.sudoku.comm.generated.Grid.Builder clearCommentsList() {
      commentsList = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'tagsList' field */
    public java.util.List<java.lang.String> getTagsList() {
      return tagsList;
    }
    
    /** Sets the value of the 'tagsList' field */
    public com.sudoku.comm.generated.Grid.Builder setTagsList(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.tagsList = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'tagsList' field has been set */
    public boolean hasTagsList() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'tagsList' field */
    public com.sudoku.comm.generated.Grid.Builder clearTagsList() {
      tagsList = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'matrix' field */
    public java.util.List<java.util.List<java.lang.Integer>> getMatrix() {
      return matrix;
    }
    
    /** Sets the value of the 'matrix' field */
    public com.sudoku.comm.generated.Grid.Builder setMatrix(java.util.List<java.util.List<java.lang.Integer>> value) {
      validate(fields()[7], value);
      this.matrix = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'matrix' field has been set */
    public boolean hasMatrix() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'matrix' field */
    public com.sudoku.comm.generated.Grid.Builder clearMatrix() {
      matrix = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'createUser' field */
    public com.sudoku.comm.generated.User getCreateUser() {
      return createUser;
    }
    
    /** Sets the value of the 'createUser' field */
    public com.sudoku.comm.generated.Grid.Builder setCreateUser(com.sudoku.comm.generated.User value) {
      validate(fields()[8], value);
      this.createUser = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'createUser' field has been set */
    public boolean hasCreateUser() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'createUser' field */
    public com.sudoku.comm.generated.Grid.Builder clearCreateUser() {
      createUser = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'createDate' field */
    public java.lang.Integer getCreateDate() {
      return createDate;
    }
    
    /** Sets the value of the 'createDate' field */
    public com.sudoku.comm.generated.Grid.Builder setCreateDate(int value) {
      validate(fields()[9], value);
      this.createDate = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'createDate' field has been set */
    public boolean hasCreateDate() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'createDate' field */
    public com.sudoku.comm.generated.Grid.Builder clearCreateDate() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'updateDate' field */
    public java.lang.Integer getUpdateDate() {
      return updateDate;
    }
    
    /** Sets the value of the 'updateDate' field */
    public com.sudoku.comm.generated.Grid.Builder setUpdateDate(int value) {
      validate(fields()[10], value);
      this.updateDate = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'updateDate' field has been set */
    public boolean hasUpdateDate() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'updateDate' field */
    public com.sudoku.comm.generated.Grid.Builder clearUpdateDate() {
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public Grid build() {
      try {
        Grid record = new Grid();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.title = fieldSetFlags()[1] ? this.title : (java.lang.String) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.String) defaultValue(fields()[2]);
        record.difficulty = fieldSetFlags()[3] ? this.difficulty : (java.lang.Integer) defaultValue(fields()[3]);
        record.published = fieldSetFlags()[4] ? this.published : (java.lang.Boolean) defaultValue(fields()[4]);
        record.commentsList = fieldSetFlags()[5] ? this.commentsList : (java.util.List<com.sudoku.comm.generated.Comment>) defaultValue(fields()[5]);
        record.tagsList = fieldSetFlags()[6] ? this.tagsList : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.matrix = fieldSetFlags()[7] ? this.matrix : (java.util.List<java.util.List<java.lang.Integer>>) defaultValue(fields()[7]);
        record.createUser = fieldSetFlags()[8] ? this.createUser : (com.sudoku.comm.generated.User) defaultValue(fields()[8]);
        record.createDate = fieldSetFlags()[9] ? this.createDate : (java.lang.Integer) defaultValue(fields()[9]);
        record.updateDate = fieldSetFlags()[10] ? this.updateDate : (java.lang.Integer) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
