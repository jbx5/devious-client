import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
   AbstractSocket() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1063469226"
   )
   @Export("isAvailable")
   public abstract boolean isAvailable(int var1) throws IOException;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1612671788"
   )
   @Export("available")
   public abstract int available() throws IOException;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-591957582"
   )
   @Export("readUnsignedByte")
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "-2106093590"
   )
   @Export("read")
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-2115422184"
   )
   @Export("write")
   public abstract void write(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "323141636"
   )
   @Export("close")
   public abstract void close();
}
