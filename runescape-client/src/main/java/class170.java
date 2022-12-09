import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class170 extends class173 {
   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive18")
   static Archive archive18;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 729229157
   )
   int field1882;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class163 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfk;Ljava/lang/String;I)V"
   )
   class170(class163 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1882 = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   public int vmethod3504() {
      return 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-736426895"
   )
   public int vmethod3511() {
      return this.field1882;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;I)V",
      garbageValue = "-2004232315"
   )
   public static void method3487(File var0) {
      FileSystem.FileSystem_cacheDir = var0;
      if (!FileSystem.FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem.FileSystem_hasPermissions = true;
      }
   }
}
