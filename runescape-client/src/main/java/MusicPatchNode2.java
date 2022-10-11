import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
   @ObfuscatedName("a")
   byte[] field3288;
   @ObfuscatedName("f")
   byte[] field3286;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1582078627
   )
   int field3282;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -732362687
   )
   int field3283;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -9953013
   )
   int field3284;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1601035699
   )
   int field3285;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 508196383
   )
   int field3280;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1320352045
   )
   int field3287;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 425773117
   )
   int field3281;

   MusicPatchNode2() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2092953426"
   )
   static final void method5441(String var0) {
      class11.method101("Please remove " + var0 + " from your ignore list first");
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "69"
   )
   @Export("setLoginResponseString")
   static void setLoginResponseString(String var0, String var1, String var2) {
      Login.Login_response1 = var0;
      Login.Login_response2 = var1;
      Login.Login_response3 = var2;
   }
}
