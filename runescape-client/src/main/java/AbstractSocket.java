import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "Lrs;"
   )
   @Export("WorldMapElement_fonts")
   static Fonts WorldMapElement_fonts;

   AbstractSocket() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1511735162"
   )
   @Export("isAvailable")
   public abstract boolean isAvailable(int var1) throws IOException;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1330081033"
   )
   @Export("available")
   public abstract int available() throws IOException;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-16"
   )
   @Export("readUnsignedByte")
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "0"
   )
   @Export("read")
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1968026935"
   )
   @Export("write")
   public abstract void write(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-105"
   )
   @Export("close")
   public abstract void close();
}
