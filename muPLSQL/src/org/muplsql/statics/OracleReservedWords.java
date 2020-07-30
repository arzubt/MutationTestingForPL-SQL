package org.muplsql.statics;

/*
 * 
 * arzubt
 *  https://docs.oracle.com/cd/B19306_01/em.102/b40103/app_oracle_reserved_words.htm
 *  13/03/2019
 *  
 */
public class OracleReservedWords {
	public static final String reservedWords[] = new String[] { "ACCESS", "ADD", "AFTER", "ALLOCATE", "AND",
			"ARCHIVELOG", "ASC", "AUTHENTICATED", "AUTOMATIC", "BEFORE", "BFILE", "BLOCK", "CACHE", "CASCADE",
			"CHAINED", "CHAR_CS", "CHECKPOINT", "CLEAR", "CLOSE", "COALESCE", "COMMENT", "COMPATIBILITY",
			"COMPOSITE_LIMIT", "CONNECT", "CONSTRAINTS", "CONTROLFILE", "CPU_PER_CALL", "CURRENT", "CURSOR", "DANGLING",
			"DATAFILES", "DBA", "DBMAC", "DEC", "DEFAULT", "DEGREE", "DESC", "DISCONNECT", "DISTRIBUTED", "DROP",
			"ELSE", "ENFORCE", "EXCEPT", "EXCLUDING", "EXISTS", "EXTENT", "FAILED_LOGIN_ATTEMPTS", "FILE", "FLOAT",
			"FOR", "FREELIST", "FULL", "GLOBALLY", "GROUP", "HASHKEYS", "HEAP", "IDLE_TIME", "IN", "INDEX", "INDICATOR",
			"INITIALLY", "INSTANCE", "INT", "INTERSECT", "ISOLATION", "KEY", "LAYER", "LIBRARY", "LINK", "LOCAL", "LOG",
			"LOGICAL_READS_PER_CALL", "MANAGE", "MAXARCHLOGS", "MAXINSTANCES", "MAXLOGMEMBERS", "MAXVALUE", "MINIMUM",
			"MINVALUE", "MODE", "MOVE", "NATIONAL", "NCLOB", "NETWORK", "NOARCHIVELOG", "NOCOMPRESS", "NOLOGGING",
			"NONE", "NOPARALLEL", "NORMAL", "NOTHING", "NUMBER", "OBJECT", "OF", "OID", "ON", "OPCODE",
			"OPTIMIZER_GOAL", "ORDER", "OVERFLOW", "PARALLEL", "PASSWORD_GRACE_TIME", "PASSWORD_REUSE_MAX", "PCTFREE",
			"PCTUSED", "PERMANENT", "POST_TRANSACTION", "PRIMARY", "PRIVATE_SGA", "PROCEDURE", "PURGE", "RANGE", "READ",
			"REBUILD", "RECOVERY", "REFERENCING", "REPLACE", "RESIZE", "RETURN", "REVERSE", "ROLES", "ROWID", "RULE",
			"SB4", "SCN", "SD_INHIBIT", "SEG_BLOCK", "SEQUENCE", "SESSION_CACHED_CURSORS", "SHARE", "SHRINK",
			"SKIP_UNUSABLE_INDEXES", "SOME", "SPLIT", "START", "STOP", "STRUCTURE", "SYS_OP_ENFORCE_NOT_NULL$",
			"SYSDATE", "SYSTEM", "TABLESPACE", "TEMPORARY", "THEN", "TIME", "TRACE", "TRANSITIONAL", "TRUE", "TYPE",
			"UID", "UNION", "UNLOCK", "UNUSABLE", "UPDATE", "USER", "VALIDATION", "VARCHAR", "VIEW", "WHERE", "WORK",
			"WRITEUP", "ACCOUNT", "ADMIN", "ALL", "ALTER", "ANY", "ARRAY", "AT", "AUTHORIZATION", "BACKUP", "BEGIN",
			"BITMAP", "BODY", "CACHE_INSTANCES", "CAST", "CHANGE", "CHARACTER", "CHOOSE", "CLOB",
			"CLOSE_CACHED_OPEN_CURSORS", "COLUMN", "COMMIT", "COMPILE", "COMPRESS", "CONNECT_TIME", "CONTENTS",
			"CONVERT", "CPU_PER_SESSION", "CURRENT_SCHEMA", "CYCLE", "DATABASE", "DATAOBJNO", "DBHIGH", "DEALLOCATE",
			"DECIMAL", "DEFERRABLE", "DELETE", "DIRECTORY", "DISMOUNT", "DML", "DUMP", "ENABLE", "ENTRY", "EXCEPTIONS",
			"EXCLUSIVE", "EXPIRE", "EXTENTS", "FALSE", "FIRST_ROWS", "FLOB", "FORCE", "FREELISTS", "FUNCTION",
			"GLOBAL_NAME", "GROUPS", "HAVING", "IDENTIFIED", "IF", "INCLUDING", "INDEXED", "IND_PARTITION", "INITRANS",
			"INSTANCES", "INTEGER", "INTO", "ISOLATION_LEVEL", "KILL", "LESS", "LIKE", "LIST", "LOCK", "LOGFILE",
			"LOGICAL_READS_PER_SESSION", "MASTER", "MAXDATAFILES", "MAXLOGFILES", "MAXSIZE", "MIN", "MINEXTENTS",
			"MLSLABEL", "MODIFY", "MTS_DISPATCHERS", "NCHAR", "NEEDED", "NEW", "NOAUDIT", "NOCYCLE", "NOMAXVALUE",
			"NOORDER", "NOPARALLEL", "NOSORT", "NOWAIT", "NUMERIC", "OBJNO", "OFF", "OIDINDEX", "ONLINE", "OPEN",
			"OPTION", "ORGANIZATION", "OWN", "PARTITION", "PASSWORD_LIFE_TIME", "PASSWORD_REUSE_TIME", "PCTINCREASE",
			"PCTVERSION", "PLAN", "PRECISION", "PRIOR", "PRIVILEGE", "PROFILE", "QUEUE", "RAW", "READUP", "RECOVER",
			"REF", "REFRESH", "RESET", "RESOURCE", "RETURNING", "REVOKE", "ROLLBACK", "ROWNUM", "SAMPLE",
			"SCAN_INSTANCES", "SCOPE", "SD_SHOW", "SEG_FILE", "SERIALIZABLE", "SESSIONS_PER_USER", "SHARED", "SIZE",
			"SMALLINT", "SORT", "SQL_TRACE", "STATEMENT_ID", "STORAGE", "SUCCESSFUL", "SYS_OP_NTCIMG$", "SYSDBA",
			"TABLE", "TABLESPACE_NO", "THAN", "THREAD", "TO", "TRACING", "TRIGGER", "TRUNCATE", "UB2", "UNARCHIVED",
			"UNIQUE", "UNRECOVERABLE", "UNUSED", "USAGE", "USING", "VALUE", "VARCHAR2", "WHEN", "WITH", "WRITE", "XID",
			"ACTIVATE", "ADVISE", "ALL_ROWS", "ANALYZE", "ARCHIVE", "AS", "AUDIT", "AUTOEXTEND", "BECOME", "BETWEEN",
			"BLOB", "BY", "CANCEL", "CFILE", "CHAR", "CHECK", "CHUNK", "CLONE", "CLUSTER", "COLUMNS", "COMMITTED",
			"COMPLETE", "COMPUTE", "CONSTRAINT", "CONTINUE", "COST", "CREATE", "CURREN_USER", "DATAFILE", "DATE",
			"DBLOW", "DEBUG", "DECLARE", "DEFERRED", "DEREF", "DISABLE", "DISTINCT", "DOUBLE", "EACH", "END", "ESCAPE",
			"EXCHANGE", "EXECUTE", "EXPLAIN", "EXTERNALLY", "FAST", "FLAGGER", "FLUSH", "FOREIGN", "FROM", "GLOBAL",
			"GRANT", "HASH", "HEADER", "IDGENERATORS", "IMMEDIATE", "INCREMENT", "INDEXES", "INITIAL", "INSERT",
			"INSTEAD", "INTERMEDIATE", "IS", "KEEP", "LABEL", "LEVEL", "LIMIT", "LOB", "LOCKED", "LOGGING", "LONG",
			"MAX", "MAXEXTENTS", "MAXLOGHISTORY", "MAXTRANS", "MEMBER", "MINUS", "MLS_LABEL_FORMAT", "MOUNT",
			"MULTISET", "NCHAR_CS", "NESTED", "NEXT", "NOCACHE", "NOFORCE", "NOMINVALUE", "NOOVERRIDE", "NOREVERSE",
			"NOT", "NULL", "NVARCHAR2", "OBJNO_REUSE", "OFFLINE", "OLD", "ONLY", "OPTIMAL", "OR", "OSLABEL", "PACKAGE",
			"PASSWORD", "PASSWORD_LOCK_TIME", "PASSWORD_VERIFY_FUNCTION", "PCTTHRESHOLD", "PERCENT", "PLSQL_DEBUG",
			"PRESERVE", "PRIVATE", "PRIVILEGES", "PUBLIC", "QUOTA", "RBA", "REAL", "RECOVERABLE", "REFERENCES",
			"RENAME", "RESETLOGS", "RESTRICTED", "REUSE", "ROLE", "ROW", "ROWS", "SAVEPOINT", "SCHEMA", "SD_ALL",
			"SEGMENT", "SELECT", "SESSION", "SET", "SHARED_POOL", "SKIP", "SNAPSHOT", "SPECIFICATION", "STANDBY",
			"STATISTICS", "STORE", "SWITCH", "SYNONYM", "SYSOPER", "TABLES", "TABNO", "THE", "TIMESTAMP", "TOPLEVEL",
			"TRANSACTION", "TRIGGERS", "TX", "UBA", "UNDO", "UNLIMITED", "UNTIL", "UPDATABLE", "USE", "VALIDATE",
			"VALUES", "VARYING", "WHENEVER", "WITHOUT", "WRITEDOWN", "YEAR","RETURN","FROM","WHERE","PACKAGE",
			"FUNCTION","PROCEDURE","AND","OR","SELECT","BOOLEAN","PLS_INTEGER","BINARY_INTEGER","CURSOR","sys_refcursor", "elsif", "LOOP"
	
	};

	public static boolean contains(String str) {
		for (String d: reservedWords) {
			if (d.equalsIgnoreCase(str)) {
				return true;
			}
		}
		return false;
	}
}
