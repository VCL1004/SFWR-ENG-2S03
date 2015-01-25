package se2s03;
//Part 4:
public class PListN {
  char hd;
  int pri;
  PListN tl;
  PListN(final int p,final char a, final PListN ll) {
    this.hd = a;
    this.pri = p;
    this.tl = ll; }
}