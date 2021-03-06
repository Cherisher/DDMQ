/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaojukeji.carrera.thrift.consumer;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-10-31")
public class QidResponse implements org.apache.thrift.TBase<QidResponse, QidResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QidResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QidResponse");

  private static final org.apache.thrift.protocol.TField TOPIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topic", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QID_FIELD_DESC = new org.apache.thrift.protocol.TField("qid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NEXT_REQUEST_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("nextRequestOffset", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("messages", org.apache.thrift.protocol.TType.LIST, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QidResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QidResponseTupleSchemeFactory());
  }

  public String topic; // required
  public String qid; // required
  public long nextRequestOffset; // optional
  public List<Message> messages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPIC((short)1, "topic"),
    QID((short)2, "qid"),
    NEXT_REQUEST_OFFSET((short)3, "nextRequestOffset"),
    MESSAGES((short)10, "messages");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPIC
          return TOPIC;
        case 2: // QID
          return QID;
        case 3: // NEXT_REQUEST_OFFSET
          return NEXT_REQUEST_OFFSET;
        case 10: // MESSAGES
          return MESSAGES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NEXTREQUESTOFFSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_REQUEST_OFFSET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC, new org.apache.thrift.meta_data.FieldMetaData("topic", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QID, new org.apache.thrift.meta_data.FieldMetaData("qid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEXT_REQUEST_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("nextRequestOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("messages", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Message.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QidResponse.class, metaDataMap);
  }

  public QidResponse() {
  }

  public QidResponse(
    String topic,
    String qid,
    List<Message> messages)
  {
    this();
    this.topic = topic;
    this.qid = qid;
    this.messages = messages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QidResponse(QidResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    if (other.isSetQid()) {
      this.qid = other.qid;
    }
    this.nextRequestOffset = other.nextRequestOffset;
    if (other.isSetMessages()) {
      List<Message> __this__messages = new ArrayList<Message>(other.messages.size());
      for (Message other_element : other.messages) {
        __this__messages.add(new Message(other_element));
      }
      this.messages = __this__messages;
    }
  }

  public QidResponse deepCopy() {
    return new QidResponse(this);
  }

  @Override
  public void clear() {
    this.topic = null;
    this.qid = null;
    setNextRequestOffsetIsSet(false);
    this.nextRequestOffset = 0;
    this.messages = null;
  }

  public String getTopic() {
    return this.topic;
  }

  public QidResponse setTopic(String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  public String getQid() {
    return this.qid;
  }

  public QidResponse setQid(String qid) {
    this.qid = qid;
    return this;
  }

  public void unsetQid() {
    this.qid = null;
  }

  /** Returns true if field qid is set (has been assigned a value) and false otherwise */
  public boolean isSetQid() {
    return this.qid != null;
  }

  public void setQidIsSet(boolean value) {
    if (!value) {
      this.qid = null;
    }
  }

  public long getNextRequestOffset() {
    return this.nextRequestOffset;
  }

  public QidResponse setNextRequestOffset(long nextRequestOffset) {
    this.nextRequestOffset = nextRequestOffset;
    setNextRequestOffsetIsSet(true);
    return this;
  }

  public void unsetNextRequestOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXTREQUESTOFFSET_ISSET_ID);
  }

  /** Returns true if field nextRequestOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetNextRequestOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXTREQUESTOFFSET_ISSET_ID);
  }

  public void setNextRequestOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXTREQUESTOFFSET_ISSET_ID, value);
  }

  public int getMessagesSize() {
    return (this.messages == null) ? 0 : this.messages.size();
  }

  public java.util.Iterator<Message> getMessagesIterator() {
    return (this.messages == null) ? null : this.messages.iterator();
  }

  public void addToMessages(Message elem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(elem);
  }

  public List<Message> getMessages() {
    return this.messages;
  }

  public QidResponse setMessages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public void unsetMessages() {
    this.messages = null;
  }

  /** Returns true if field messages is set (has been assigned a value) and false otherwise */
  public boolean isSetMessages() {
    return this.messages != null;
  }

  public void setMessagesIsSet(boolean value) {
    if (!value) {
      this.messages = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((String)value);
      }
      break;

    case QID:
      if (value == null) {
        unsetQid();
      } else {
        setQid((String)value);
      }
      break;

    case NEXT_REQUEST_OFFSET:
      if (value == null) {
        unsetNextRequestOffset();
      } else {
        setNextRequestOffset((Long)value);
      }
      break;

    case MESSAGES:
      if (value == null) {
        unsetMessages();
      } else {
        setMessages((List<Message>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC:
      return getTopic();

    case QID:
      return getQid();

    case NEXT_REQUEST_OFFSET:
      return Long.valueOf(getNextRequestOffset());

    case MESSAGES:
      return getMessages();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC:
      return isSetTopic();
    case QID:
      return isSetQid();
    case NEXT_REQUEST_OFFSET:
      return isSetNextRequestOffset();
    case MESSAGES:
      return isSetMessages();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QidResponse)
      return this.equals((QidResponse)that);
    return false;
  }

  public boolean equals(QidResponse that) {
    if (that == null)
      return false;

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    boolean this_present_qid = true && this.isSetQid();
    boolean that_present_qid = true && that.isSetQid();
    if (this_present_qid || that_present_qid) {
      if (!(this_present_qid && that_present_qid))
        return false;
      if (!this.qid.equals(that.qid))
        return false;
    }

    boolean this_present_nextRequestOffset = true && this.isSetNextRequestOffset();
    boolean that_present_nextRequestOffset = true && that.isSetNextRequestOffset();
    if (this_present_nextRequestOffset || that_present_nextRequestOffset) {
      if (!(this_present_nextRequestOffset && that_present_nextRequestOffset))
        return false;
      if (this.nextRequestOffset != that.nextRequestOffset)
        return false;
    }

    boolean this_present_messages = true && this.isSetMessages();
    boolean that_present_messages = true && that.isSetMessages();
    if (this_present_messages || that_present_messages) {
      if (!(this_present_messages && that_present_messages))
        return false;
      if (!this.messages.equals(that.messages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topic = true && (isSetTopic());
    list.add(present_topic);
    if (present_topic)
      list.add(topic);

    boolean present_qid = true && (isSetQid());
    list.add(present_qid);
    if (present_qid)
      list.add(qid);

    boolean present_nextRequestOffset = true && (isSetNextRequestOffset());
    list.add(present_nextRequestOffset);
    if (present_nextRequestOffset)
      list.add(nextRequestOffset);

    boolean present_messages = true && (isSetMessages());
    list.add(present_messages);
    if (present_messages)
      list.add(messages);

    return list.hashCode();
  }

  @Override
  public int compareTo(QidResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopic()).compareTo(other.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic, other.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQid()).compareTo(other.isSetQid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qid, other.qid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNextRequestOffset()).compareTo(other.isSetNextRequestOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextRequestOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextRequestOffset, other.nextRequestOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessages()).compareTo(other.isSetMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messages, other.messages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QidResponse(");
    boolean first = true;

    sb.append("topic:");
    if (this.topic == null) {
      sb.append("null");
    } else {
      sb.append(this.topic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("qid:");
    if (this.qid == null) {
      sb.append("null");
    } else {
      sb.append(this.qid);
    }
    first = false;
    if (isSetNextRequestOffset()) {
      if (!first) sb.append(", ");
      sb.append("nextRequestOffset:");
      sb.append(this.nextRequestOffset);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("messages:");
    if (this.messages == null) {
      sb.append("null");
    } else {
      sb.append(this.messages);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (topic == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topic' was not present! Struct: " + toString());
    }
    if (qid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'qid' was not present! Struct: " + toString());
    }
    if (messages == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messages' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QidResponseStandardSchemeFactory implements SchemeFactory {
    public QidResponseStandardScheme getScheme() {
      return new QidResponseStandardScheme();
    }
  }

  private static class QidResponseStandardScheme extends StandardScheme<QidResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QidResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topic = iprot.readString();
              struct.setTopicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qid = iprot.readString();
              struct.setQidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEXT_REQUEST_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.nextRequestOffset = iprot.readI64();
              struct.setNextRequestOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list54 = iprot.readListBegin();
                struct.messages = new ArrayList<Message>(_list54.size);
                Message _elem55;
                for (int _i56 = 0; _i56 < _list54.size; ++_i56)
                {
                  _elem55 = new Message();
                  _elem55.read(iprot);
                  struct.messages.add(_elem55);
                }
                iprot.readListEnd();
              }
              struct.setMessagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, QidResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topic != null) {
        oprot.writeFieldBegin(TOPIC_FIELD_DESC);
        oprot.writeString(struct.topic);
        oprot.writeFieldEnd();
      }
      if (struct.qid != null) {
        oprot.writeFieldBegin(QID_FIELD_DESC);
        oprot.writeString(struct.qid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNextRequestOffset()) {
        oprot.writeFieldBegin(NEXT_REQUEST_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.nextRequestOffset);
        oprot.writeFieldEnd();
      }
      if (struct.messages != null) {
        oprot.writeFieldBegin(MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.messages.size()));
          for (Message _iter57 : struct.messages)
          {
            _iter57.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QidResponseTupleSchemeFactory implements SchemeFactory {
    public QidResponseTupleScheme getScheme() {
      return new QidResponseTupleScheme();
    }
  }

  private static class QidResponseTupleScheme extends TupleScheme<QidResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QidResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topic);
      oprot.writeString(struct.qid);
      {
        oprot.writeI32(struct.messages.size());
        for (Message _iter58 : struct.messages)
        {
          _iter58.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetNextRequestOffset()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNextRequestOffset()) {
        oprot.writeI64(struct.nextRequestOffset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QidResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topic = iprot.readString();
      struct.setTopicIsSet(true);
      struct.qid = iprot.readString();
      struct.setQidIsSet(true);
      {
        org.apache.thrift.protocol.TList _list59 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.messages = new ArrayList<Message>(_list59.size);
        Message _elem60;
        for (int _i61 = 0; _i61 < _list59.size; ++_i61)
        {
          _elem60 = new Message();
          _elem60.read(iprot);
          struct.messages.add(_elem60);
        }
      }
      struct.setMessagesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.nextRequestOffset = iprot.readI64();
        struct.setNextRequestOffsetIsSet(true);
      }
    }
  }

}

