from source.src.Python.challenges.containerWithMostWater import maxContainer

if __name__ == "__main__":
    print("Start")
    container = maxContainer
    height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    max = container.maxArea(container, height)
    print(f"max = {max}")
