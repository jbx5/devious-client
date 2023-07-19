package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSArchive;
import net.runelite.rs.api.RSArchiveDisk;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNewArchiveStuff;

@Mixin(RSArchive.class)
public abstract class RSArchiveMixin implements RSArchive
{

	@Shadow("client")
	private static RSClient client;

	@Shadow("archives")
	private static RSArchive[] archives;

	@MethodHook(value = "<init>", end = true)
	@Inject
	private void rl$init(RSArchiveDisk var1, RSArchiveDisk var2, RSNewArchiveStuff var3, int archive, boolean var5, boolean var6, boolean var7, boolean var8)
	{
		if (archive >= 0 && archive < 21)
		{
			archives[archive] = this;
		}
	}
}
