package si;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParseError extends RuntimeException {
  public final String msg;
  public final Token s, e;
  
  public ParseError(String msg, Token s, Token e) {
    this.msg = msg;
    this.s = s;
    this.e = e;
  }
  public ParseError(String msg, Token tk) {
    this(msg, tk, tk);
  }
  public ParseError(String msg, ParserRuleContext tk) {
    this(msg, tk.getStart(), tk.getStop());
  }
  public ParseError(String msg, TerminalNode n) {
    this(msg, n.getSymbol());
  }
  
  
  public ParseError(String msg) {
    this(msg, null, null);
  }
  
  public String get(String[] lns, String path) {
    if (s==null) return msg;
    int sl = s.getLine(); int sp = s.getCharPositionInLine();
    int el = e.getLine(); int ep = e.getCharPositionInLine() + e.getStopIndex()-e.getStartIndex()+1;
    String ln = lns[sl-1];
    if (sl!=el) ep = ln.length();
    StringBuilder b = new StringBuilder();
    b.append(path).append(':').append(sl).append(": ").append(msg).append('\n');
    b.append(ln).append('\n');
    for (int i = 0; i < sp; i++) b.append(' ');
    for (int i = sp; i < ep; i++) b.append('^');
    if (sl!=el) b.append("...");
    return b.toString();
  }
}
