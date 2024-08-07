/*
 * Copyright (c) 2021, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import net.runelite.api.EnumComposition;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanTitle;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClanSettings;
import net.runelite.rs.api.RSClient;

import java.util.ArrayList;
import java.util.List;

@Mixin(RSClanSettings.class)
public abstract class RSClanSettingsMixin implements RSClanSettings
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public List<ClanMember> getMembers()
	{
		int memberCount = getMemberCount();
		List<ClanMember> memberList = new ArrayList<>(memberCount);

		for (int i = 0; i < memberCount; i++)
		{
			memberList.add((ClanMember) client.runeliteClanMember(this, i));
		}

		return memberList;
	}

	@Inject
	@Override
	public ClanMember findMember(String name)
	{
		name = name.replace(" ", "\u00A0").toLowerCase();
		String[] memberNames = getMemberNames();
		int[] sorted = getSortedMembers();

		int i = 0;
		int len = sorted.length - 1;
		while (i <= len)
		{
			int tag = (i + len) >>> 1;
			int memberIndex = sorted[tag];
			String memberName = memberNames[memberIndex];
			int compare = memberName.toLowerCase().compareTo(name);
			if (compare < 0)
			{
				i = tag + 1;
			}
			else if (compare == 0)
			{
				return (ClanMember) client.runeliteClanMember(this, memberIndex);
			}
			else
			{
				len = tag - 1;
			}
		}

		return null;
	}

	@Inject
	@Override
	public ClanTitle titleForRank(ClanRank clanRank)
	{
		assert client.isClientThread() : "titleForRank must be called on client thread";

		int title;
		switch (clanRank.getRank())
		{
			case -1:
				title = -1;
				break;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 91:
			case 92:
			case 93:
			case 94:
			case 106:
			case 107:
			case 108:
			case 109:
			case 111:
			case 112:
			case 113:
			case 114:
			case 116:
			case 117:
			case 118:
			case 119:
			case 121:
			case 122:
			case 123:
			default:
				title = this.getTitle(1, 0, 9);
				break;
			case 10:
				title = this.getTitle(1, 10, 19);
				break;
			case 20:
				title = this.getTitle(1, 20, 29);
				break;
			case 30:
				title = this.getTitle(2, 0, 9);
				break;
			case 40:
				title = this.getTitle(2, 10, 19);
				break;
			case 50:
				title = this.getTitle(2, 20, 29);
				break;
			case 60:
				title = this.getTitle(3, 0, 9);
				break;
			case 70:
				title = this.getTitle(3, 10, 19);
				break;
			case 80:
				title = this.getTitle(3, 20, 29);
				break;
			case 90:
				title = this.getTitle(4, 0, 9);
				break;
			case 95:
				title = this.getTitle(5, 20, 29);
				break;
			case 96:
				title = this.getTitle(102, 0, 9);
				break;
			case 97:
				title = this.getTitle(102, 10, 19);
				break;
			case 98:
				title = this.getTitle(102, 20, 29);
				break;
			case 99:
				title = this.getTitle(103, 0, 9);
				break;
			case 100:
				title = -2;
				break;
			case 101:
				title = this.getTitle(103, 10, 19);
				break;
			case 102:
				title = this.getTitle(103, 20, 29);
				break;
			case 103:
				title = this.getTitle(104, 0, 9);
				break;
			case 104:
				title = this.getTitle(104, 10, 19);
				break;
			case 105:
				title = this.getTitle(4, 10, 19);
				break;
			case 110:
				title = this.getTitle(4, 20, 29);
				break;
			case 115:
				title = this.getTitle(5, 0, 9);
				break;
			case 120:
				title = this.getTitle(5, 10, 19);
				break;
			case 124:
				title = this.getTitle(104, 20, 29);
				break;
			case 125:
				title = -3;
				break;
			case 126:
				title = -4;
				break;
			case 127:
				title = -5;
		}

		if (title == 1023)
		{
			return null;
		}
		else
		{
			EnumComposition rsEnum = client.getEnum(3797);
			String titleName = rsEnum.getStringValue(title);
			return !titleName.isEmpty() ? new ClanTitle(title, titleName) : null;
		}
	}

	@Inject
	private int getTitle(int group, int sub1, int sub2)
	{
		Integer oParam = getTitleGroupValue(group);
		int param = oParam == null ? -1 : oParam;
		int offset = 31 - sub2;
		return (param << offset) >>> (sub1 + offset);
	}
}
