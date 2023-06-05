/*
 * This file is part of Glow ( https://github.com/playsawdust/glow-base ), used under the Mozilla Public License.
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package blue.endless.glow.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Model implements Iterable<Mesh> {
	protected List<Mesh> meshes = new ArrayList<>();
	
	public void transform(Matrix3d matrix) {
		for(Mesh mesh : meshes) mesh.transform(matrix);
	}
	
	public void transform(Matrix4d matrix) {
		for(Mesh mesh : meshes) mesh.transform(matrix);
	}
	
	public List<Mesh> getMeshes() {
		return meshes;
	}
	
	@Override
	public Iterator<Mesh> iterator() {
		return meshes.iterator();
	}
}