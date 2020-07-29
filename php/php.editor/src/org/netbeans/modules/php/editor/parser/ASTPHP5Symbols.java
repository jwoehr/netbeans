/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Aug 01 21:19:06 JST 2020
//----------------------------------------------------

package org.netbeans.modules.php.editor.parser;

/** CUP generated interface containing symbol constants. */
public interface ASTPHP5Symbols {
  /* terminals */
  public static final int T_BOOLEAN_AND = 104;
  public static final int T_INLINE_HTML = 10;
  public static final int T_EMPTY = 49;
  public static final int T_PROTECTED = 147;
  public static final int T_CLOSE_RECT = 138;
  public static final int T_TRAIT_C = 61;
  public static final int T_IS_NOT_EQUAL = 109;
  public static final int T_INCLUDE = 79;
  public static final int T_QUATE = 153;
  public static final int T_GLOBAL = 45;
  public static final int T_PRINT = 88;
  public static final int T_OR_EQUAL = 97;
  public static final int T_LOGICAL_XOR = 86;
  public static final int T_COALESCE = 162;
  public static final int T_FUNCTION = 35;
  public static final int T_STATIC = 143;
  public static final int T_NEKUDA = 126;
  public static final int T_THROW = 42;
  public static final int T_CLASS = 51;
  public static final int T_ABSTRACT = 144;
  public static final int T_ENCAPSED_AND_WHITESPACE = 11;
  public static final int T_MOD_EQUAL = 95;
  public static final int T_BREAK = 31;
  public static final int T_WHILE = 15;
  public static final int T_DO = 14;
  public static final int T_CONST = 36;
  public static final int T_CONTINUE = 32;
  public static final int T_FUNC_C = 63;
  public static final int T_DIV = 122;
  public static final int T_LOGICAL_OR = 85;
  public static final int T_DIR = 75;
  public static final int T_OPEN_PARENTHESE = 149;
  public static final int T_REFERENCE = 107;
  public static final int T_COMMA = 84;
  public static final int T_FINALLY = 43;
  public static final int T_ELSE = 142;
  public static final int T_IS_EQUAL = 108;
  public static final int T_LIST = 57;
  public static final int T_NAMESPACE = 73;
  public static final int T_NS_SEPARATOR = 76;
  public static final int T_OR = 105;
  public static final int T_IS_IDENTICAL = 110;
  public static final int T_INC = 127;
  public static final int T_ELSEIF = 141;
  public static final int T_TRY = 40;
  public static final int T_START_NOWDOC = 155;
  public static final int T_PRIVATE = 146;
  public static final int T_UNSET_CAST = 135;
  public static final int T_INCLUDE_ONCE = 80;
  public static final int T_ENDIF = 140;
  public static final int T_SR_EQUAL = 100;
  public static final int EOF = 0;
  public static final int T_CALLABLE = 59;
  public static final int T_PUBLIC = 148;
  public static final int T_OBJECT_OPERATOR = 55;
  public static final int T_TILDA = 125;
  public static final int T_PAAMAYIM_NEKUDOTAYIM = 72;
  public static final int T_IS_SMALLER_OR_EQUAL = 112;
  public static final int T_ELLIPSIS = 161;
  public static final int T_XOR_EQUAL = 98;
  public static final int T_ENDFOREACH = 20;
  public static final int T_CONSTANT_ENCAPSED_STRING = 12;
  public static final int T_BACKQUATE = 154;
  public static final int T_AT = 136;
  public static final int T_AS = 25;
  public static final int T_CURLY_CLOSE = 71;
  public static final int T_ENDDECLARE = 22;
  public static final int T_CATCH = 41;
  public static final int T_CASE = 29;
  public static final int T_VARIABLE = 8;
  public static final int T_INSTEADOF = 158;
  public static final int T_NEW = 139;
  public static final int T_MINUS_EQUAL = 91;
  public static final int T_PLUS = 119;
  public static final int T_SL_EQUAL = 99;
  public static final int T_ENDWHILE = 16;
  public static final int T_ENDFOR = 18;
  public static final int T_TRAIT = 157;
  public static final int T_CLONE = 24;
  public static final int T_BOOLEAN_OR = 103;
  public static final int T_UNSET = 47;
  public static final int T_INTERFACE = 52;
  public static final int T_SWITCH = 26;
  public static final int T_IS_GREATER_OR_EQUAL = 113;
  public static final int T_OPEN_RECT = 137;
  public static final int T_CURLY_OPEN_WITH_DOLAR = 69;
  public static final int T_FINAL = 145;
  public static final int T_REQUIRE = 82;
  public static final int T_FILE = 65;
  public static final int T_DEC = 128;
  public static final int T_CLOSE_PARENTHESE = 150;
  public static final int T_CLASS_C = 60;
  public static final int T_EVAL = 81;
  public static final int T_MATCH = 28;
  public static final int T_POW = 159;
  public static final int T_RGREATER = 115;
  public static final int T_IS_NOT_IDENTICAL = 111;
  public static final int T_NOT = 124;
  public static final int T_REQUIRE_ONCE = 83;
  public static final int T_POW_EQUAL = 160;
  public static final int T_NS_C = 74;
  public static final int T_DOLLAR_OPEN_CURLY_BRACES = 68;
  public static final int T_SPACESHIP = 114;
  public static final int T_VAR = 46;
  public static final int T_START_HEREDOC = 66;
  public static final int T_ENDSWITCH = 27;
  public static final int T_OBJECT_CAST = 133;
  public static final int T_ECHO = 13;
  public static final int T_LINE = 64;
  public static final int T_FOR = 17;
  public static final int T_IMPLEMENTS = 54;
  public static final int T_ARRAY_CAST = 132;
  public static final int T_DOLLAR = 152;
  public static final int T_TIMES = 121;
  public static final int T_DOUBLE_CAST = 130;
  public static final int T_BOOL_CAST = 134;
  public static final int T_PRECENT = 123;
  public static final int T_LNUMBER = 4;
  public static final int T_CURLY_OPEN = 70;
  public static final int T_DEFINE = 78;
  public static final int T_QUESTION_MARK = 101;
  public static final int T_END_NOWDOC = 156;
  public static final int T_USE = 44;
  public static final int T_KOVA = 106;
  public static final int T_IF = 3;
  public static final int T_MUL_EQUAL = 92;
  public static final int T_ARRAY = 58;
  public static final int T_LGREATER = 116;
  public static final int T_COALESCE_EQUAL = 163;
  public static final int T_SEMICOLON = 102;
  public static final int T_NEKUDOTAIM = 151;
  public static final int T_VAR_COMMENT = 77;
  public static final int T_CONCAT_EQUAL = 94;
  public static final int T_YIELD = 38;
  public static final int T_AND_EQUAL = 96;
  public static final int T_DNUMBER = 5;
  public static final int T_MINUS = 120;
  public static final int T_FOREACH = 19;
  public static final int T_EXIT = 2;
  public static final int T_DECLARE = 21;
  public static final int T_STRING_VARNAME = 7;
  public static final int T_EXTENDS = 53;
  public static final int T_METHOD_C = 62;
  public static final int T_INT_CAST = 129;
  public static final int T_ISSET = 48;
  public static final int T_LOGICAL_AND = 87;
  public static final int error = 1;
  public static final int T_RETURN = 37;
  public static final int T_DEFAULT = 30;
  public static final int T_SR = 118;
  public static final int T_YIELD_FROM = 39;
  public static final int T_EQUAL = 89;
  public static final int T_SL = 117;
  public static final int T_END_HEREDOC = 67;
  public static final int T_DOUBLE_ARROW = 56;
  public static final int T_STRING_CAST = 131;
  public static final int T_STRING = 6;
  public static final int T_PLUS_EQUAL = 90;
  public static final int T_FN = 34;
  public static final int T_INSTANCEOF = 23;
  public static final int T_DIV_EQUAL = 93;
  public static final int T_NUM_STRING = 9;
  public static final int T_HALT_COMPILER = 50;
  public static final int T_GOTO = 33;
}

