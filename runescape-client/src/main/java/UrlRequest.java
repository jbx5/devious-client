import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("UrlRequest")
public class UrlRequest {
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -685256153
   )
   static int field1403 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1778633031
   )
   static int field1404 = 1536228292;
   @ObfuscatedName("aj")
   final URL field1405;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 475379689
   )
   volatile int field1402;
   @ObfuscatedName("an")
   @Export("response0")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.field1402 = field1403;
      this.field1405 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "549528116"
   )
   @Export("isDone")
   public boolean isDone() {
      return this.field1402 != field1403;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "1852193551"
   )
   @Export("getResponse")
   public byte[] getResponse() {
      return this.response0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "-24011"
   )
   public String method2828() {
      return this.field1405.toString();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IZIZI)V",
      garbageValue = "837272188"
   )
   @Export("sortWorldList")
   static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
      if (class260.World_worlds != null) {
         class12.doWorldSorting(0, class260.World_worlds.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1203549376"
   )
   public static void method2834() {
      ParamComposition.ParamDefinition_cached.clear();
   }
}
