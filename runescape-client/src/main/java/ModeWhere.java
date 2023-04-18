import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4351("", 0, new class355[]{class355.field4307}),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4333("", 1, new class355[]{class355.field4308, class355.field4307}),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4334("", 2, new class355[]{class355.field4308, class355.field4309, class355.field4307}),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4343("", 3, new class355[]{class355.field4308}),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4336("", 4),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4339("", 5, new class355[]{class355.field4308, class355.field4307}),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4332("", 6, new class355[]{class355.field4307}),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4335("", 8, new class355[]{class355.field4308, class355.field4307}),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4340("", 9, new class355[]{class355.field4308, class355.field4309}),
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4341("", 10, new class355[]{class355.field4308}),
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4342("", 11, new class355[]{class355.field4308}),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4349("", 12, new class355[]{class355.field4308, class355.field4307}),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   field4337("", 13, new class355[]{class355.field4308});

   @ObfuscatedName("ak")
   @Export("operatingSystemName")
   public static String operatingSystemName;
   @ObfuscatedName("gb")
   static String field4347;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -336951645
   )
   @Export("id")
   final int id;
   @ObfuscatedName("ag")
   final Set field4346 = new HashSet();

   static {
      method6945();
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I[Lnc;)V"
   )
   ModeWhere(String var3, int var4, class355[] var5) {
      this.id = var4;
      class355[] var6 = var5;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class355 var8 = var6[var7];
         this.field4346.add(var8);
      }

   }

   ModeWhere(String var3, int var4) {
      this.id = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)[Lne;",
      garbageValue = "-88"
   )
   static ModeWhere[] method6945() {
      return new ModeWhere[]{field4332, field4340, field4339, field4351, field4343, field4342, field4333, field4349, field4335, field4334, field4336, field4337, field4341};
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IB)V",
      garbageValue = "17"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field3645 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field3643 == null) {
            var0.field3643 = new int[var0.field3645.length];
         }

         var0.field3643[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("nh")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1227239523"
   )
   static String method6952(String var0) {
      PlayerType[] var1 = StudioGame.PlayerType_values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PlayerType var3 = var1[var2];
         if (var3.modIcon != -1 && var0.startsWith(ArchiveDiskActionHandler.method6619(var3.modIcon))) {
            var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
            break;
         }
      }

      return var0;
   }
}
