import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class145 extends class155 {
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static AbstractArchive field1689;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 462461389
   )
   int field1684;
   @ObfuscatedName("w")
   byte field1687;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1636205357
   )
   int field1683;
   @ObfuscatedName("s")
   String field1686;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfn;"
   )
   final class156 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfn;)V"
   )
   class145(class156 var1) {
      this.this$0 = var1;
      this.field1684 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "-123"
   )
   void vmethod3387(Buffer var1) {
      this.field1684 = var1.readUnsignedShort();
      this.field1687 = var1.readByte();
      this.field1683 = var1.readUnsignedShort();
      var1.readLong();
      this.field1686 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lfm;I)V",
      garbageValue = "127147356"
   )
   void vmethod3388(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1684);
      var2.rank = this.field1687;
      var2.world = this.field1683;
      var2.username = new Username(this.field1686);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lqu;ILjava/lang/String;S)Ljava/lang/String;",
      garbageValue = "-3344"
   )
   static String method3192(IterableNodeHashTable var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lba;",
      garbageValue = "-1454987791"
   )
   @Export("getWorldMapScript")
   static Script getWorldMapScript(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16));
      Script var5;
      if (var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class12.archive12.getGroupId(var7);
         if (var8 == -1) {
            var5 = null;
         } else {
            label58: {
               byte[] var9 = class12.archive12.takeFileFlat(var8);
               if (var9 != null) {
                  if (var9.length <= 1) {
                     var5 = null;
                     break label58;
                  }

                  var6 = WorldMapLabelSize.newScript(var9);
                  if (var6 != null) {
                     Script.Script_cached.put(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label58;
                  }
               }

               var5 = null;
            }
         }
      }

      if (var5 != null) {
         return var5;
      } else {
         int var4 = class208.method4221(var2, var0);
         Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16));
         Script var13;
         if (var12 != null) {
            var13 = var12;
         } else {
            String var14 = String.valueOf(var4);
            int var10 = class12.archive12.getGroupId(var14);
            if (var10 == -1) {
               var13 = null;
            } else {
               byte[] var11 = class12.archive12.takeFileFlat(var10);
               if (var11 != null) {
                  if (var11.length <= 1) {
                     var13 = null;
                     return var13 != null ? var13 : null;
                  }

                  var12 = WorldMapLabelSize.newScript(var11);
                  if (var12 != null) {
                     Script.Script_cached.put(var12, (long)(var4 << 16));
                     var13 = var12;
                     return var13 != null ? var13 : null;
                  }
               }

               var13 = null;
            }
         }

         return var13 != null ? var13 : null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IB)V",
      garbageValue = "33"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field3632 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field3594 == null) {
            var0.field3594 = new int[var0.field3632.length];
         }

         var0.field3594[var1] = Integer.MAX_VALUE;
      }
   }
}
